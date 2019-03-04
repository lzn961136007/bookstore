package com.bs.mall.pojo;


public class AllContent {
	private Integer bookId;
	private String bookName;
	private String bookCategory;
	private Double bookSalesPrice;
	private String bookProfile;
	private String PublishName;
	private String bookCoverImage;
	private String authorName;
	private Integer stockNum;
	private Integer stockSales;
	private String bookStatus;
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookCategory() {
		return bookCategory;
	}
	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}
	public Double getBookSalesPrice() {
		return bookSalesPrice;
	}
	public void setBookSalesPrice(Double bookSalesPrice) {
		this.bookSalesPrice = bookSalesPrice;
	}
	public String getBookProfile() {
		return bookProfile;
	}
	public void setBookProfile(String bookProfile) {
		this.bookProfile = bookProfile;
	}
	public String getPublishName() {
		return PublishName;
	}
	public void setPublishName(String publishName) {
		PublishName = publishName;
	}
	public String getBookCoverImage() {
		return bookCoverImage;
	}
	public void setBookCoverImage(String bookCoverImage) {
		this.bookCoverImage = bookCoverImage;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Integer getStockNum() {
		return stockNum;
	}
	public void setStockNum(Integer stockNum) {
		this.stockNum = stockNum;
	}
	public Integer getStockSales() {
		return stockSales;
	}
	public void setStockSales(Integer stockSales) {
		this.stockSales = stockSales;
	}
	public String getBookStatus() {
		return bookStatus;
	}
	public void setBookStatus(String bookStatus) {
		this.bookStatus = bookStatus;
	}
	@Override
	public String toString() {
		return "AllContent [bookId=" + bookId + ", bookName=" + bookName + ", bookCategory=" + bookCategory
				+ ", bookSalesPrice=" + bookSalesPrice + ", bookProfile=" + bookProfile + ", PublishName=" + PublishName
				+ ", bookCoverImage=" + bookCoverImage + ", authorName=" + authorName + ", stockNum=" + stockNum
				+ ", stockSales=" + stockSales + ", bookStatus=" + bookStatus + "]";
	}
	public AllContent(Integer bookId, String bookName, String bookCategory, Double bookSalesPrice, String bookProfile,
			String publishName, String bookCoverImage, String authorName, Integer stockNum, Integer stockSales,
			String bookStatus) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookCategory = bookCategory;
		this.bookSalesPrice = bookSalesPrice;
		this.bookProfile = bookProfile;
		PublishName = publishName;
		this.bookCoverImage = bookCoverImage;
		this.authorName = authorName;
		this.stockNum = stockNum;
		this.stockSales = stockSales;
		this.bookStatus = bookStatus;
	}
	public AllContent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
