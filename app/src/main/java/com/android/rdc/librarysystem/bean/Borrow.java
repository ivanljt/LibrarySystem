package com.android.rdc.librarysystem.bean;

import org.litepal.crud.DataSupport;

import java.util.Date;

/**
 * 借书和还书日期
 */
public class Borrow extends DataSupport {
//    private int id;//借阅编号
    private Reader reader;//读者
    private Book book;//所借的书籍
    private Date borrowDate;//借书的时间
    private Date returnDate;//还书的时间
    private String remark;//备注

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}