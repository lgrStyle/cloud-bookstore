package io.bookstore.book.api.fallback;

import io.bookstore.book.api.BookApi;
import io.bookstore.book.entity.Book;
import io.bookstore.book.entity.BookComment;
import io.bookstore.common.bean.PageBean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookApiFallback implements BookApi {
    @Override
    public List<Book> queryBookByMinUpdateTime(Date minDate, int limit) {
        return null;
    }

    @Override
    public List<Book> queryBookByIds(List<Long> ids) {
        return new ArrayList<>();
    }

    @Override
    public List<Book> listRank(Byte type, Integer limit) {
        return new ArrayList<>();
    }

    @Override
    public Book queryBookById(Long id) {
        return null;
    }

    @Override
    public boolean addBookComment(Long userId, BookComment comment) {

        return false;

    }

    @Override
    public PageBean<BookComment> listUserCommentByPage(Long userId, int page, int pageSize) {
        return new PageBean<>(new ArrayList<>());
    }

    @Override
    public List<Book> queryNetworkPicBooks(String localPicPrefix, int limit) {
        return new ArrayList<>();
    }

    @Override
    public boolean updateBookPic(String picUrl, Long bookId) {
        return false;
    }
}
