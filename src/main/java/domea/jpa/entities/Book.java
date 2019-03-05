package domea.jpa.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Books", uniqueConstraints = {
        @UniqueConstraint(name = "Books_ISBNs", columnNames = { "Isbn" })
},
indexes = {
        @Index(name = "Books_Titles", columnList = "Title")
})
public class Book implements Serializable
{
    private long id;
    private String isbn;
    private String title;
    private String author;
    private double price;
    private String publisher;
    private byte[]  previewPdf;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId()
    {
        return this.id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    @Basic(optional = false)
    public String getIsbn()
    {
        return this.isbn;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    @Lob
    public byte[] getPreviewPdf() {
        return previewPdf;
    }

    public void setPreviewPdf(byte[] previewPdf) {
        this.previewPdf = previewPdf;
    }

    @Basic(optional = false)
    public String getTitle()
    {
        return this.title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    @Basic(optional = false)
    public String getAuthor()
    {
        return this.author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    @Basic
    public double getPrice()
    {
        return this.price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    @Basic(optional = false)
    public String getPublisher()
    {
        return this.publisher;
    }

    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }
}
