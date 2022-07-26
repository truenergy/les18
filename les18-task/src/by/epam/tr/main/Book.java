package by.epam.tr.main;

import java.util.Objects;

public class Book {
	private int id;
	private String name;
	private String author;
	private String publish;
	private int publishDate;
	private int pages;
	private double price;
	private String bindingType;

	public Book() {
		id = 0;
		name = "";
		author = "";
		publish = "";
		publishDate = 0;
		pages = 0;
		price = 0;
		bindingType = "";
	}

	public Book(int id, String name, String author, String publish, int publishDate, int pages, double price,
			String bindingType) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publish = publish;
		this.publishDate = publishDate;
		this.pages = pages;
		this.price = price;
		this.bindingType = bindingType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	public int getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(int publishDate) {
		this.publishDate = publishDate;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBindingType() {
		return bindingType;
	}

	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, bindingType, id, name, pages, price, publish, publishDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(bindingType, other.bindingType) && id == other.id
				&& Objects.equals(name, other.name) && pages == other.pages && price == other.price
				&& Objects.equals(publish, other.publish) && publishDate == other.publishDate;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publish=" + publish + ", publishDate="
				+ publishDate + ", pages=" + pages + ", price=" + price + ", bindingType=" + bindingType + "]";
	}

	

}
