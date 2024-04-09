package springProject1.bookProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springProject1.bookProject.model.book;
import springProject1.bookProject.repository.BookRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    // Endpoint to get all books
    @GetMapping
    public List<book> getAllBooks() {
        return bookRepository.findAll();
    }

    // Endpoint to get a book by ID
    @GetMapping("/{id}")
    public ResponseEntity<book> getBookById(@PathVariable int id) {
        Optional<book> optionalBook = bookRepository.findById(id);
        return optionalBook.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Endpoint to create a new book
    @PostMapping
    public ResponseEntity<book> createBook(@RequestBody book book) {
        book savedBook = bookRepository.save(book);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedBook);
    }

    // Endpoint to update an existing book
    @PutMapping("/{id}")
    public ResponseEntity<book> updateBook(@PathVariable int id, @RequestBody book bookDetails) {
        Optional<book> optionalBook = bookRepository.findById(id);
        if (optionalBook.isPresent()) {
            book existingBook = optionalBook.get();
            existingBook.setTitle(bookDetails.getTitle());
            existingBook.setAuthor(bookDetails.getAuthor());
            // Set other fields as needed
            book updatedBook = bookRepository.save(existingBook);
            return ResponseEntity.ok(updatedBook);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Endpoint to delete a book
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable int id) {
        Optional<book> optionalBook = bookRepository.findById(id);
        if (optionalBook.isPresent()) {
            bookRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}