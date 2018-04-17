package bwe;

public class Konyv {
	private String title;
	private String author;
	private int dateOfissue;
	private int price;

	public Konyv(String title, String author, int dateOfissue, int price) {
		this.title = title;
		this.author = author;
		this.dateOfissue = dateOfissue;
		this.price = price;
	}

	public void priceIncrement(int percentage) {
		this.price = (int) (this.price + (this.price * (percentage / 100.0f)));
	}

	@Override
	public String toString() {
		return "title=" + title + ", author=" + author + ", dateOfissue=" + dateOfissue + ", price=" + price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getDateOfissue() {
		return dateOfissue;
	}

	public void setDateOfissue(int dateOfissue) {
		this.dateOfissue = dateOfissue;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}