package io.bookstore.all.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andWorkDirectionIsNull() {
            addCriterion("work_direction is null");
            return (Criteria) this;
        }

        public Criteria andWorkDirectionIsNotNull() {
            addCriterion("work_direction is not null");
            return (Criteria) this;
        }

        public Criteria andWorkDirectionEqualTo(Byte value) {
            addCriterion("work_direction =", value, "workDirection");
            return (Criteria) this;
        }

        public Criteria andWorkDirectionNotEqualTo(Byte value) {
            addCriterion("work_direction <>", value, "workDirection");
            return (Criteria) this;
        }

        public Criteria andWorkDirectionGreaterThan(Byte value) {
            addCriterion("work_direction >", value, "workDirection");
            return (Criteria) this;
        }

        public Criteria andWorkDirectionGreaterThanOrEqualTo(Byte value) {
            addCriterion("work_direction >=", value, "workDirection");
            return (Criteria) this;
        }

        public Criteria andWorkDirectionLessThan(Byte value) {
            addCriterion("work_direction <", value, "workDirection");
            return (Criteria) this;
        }

        public Criteria andWorkDirectionLessThanOrEqualTo(Byte value) {
            addCriterion("work_direction <=", value, "workDirection");
            return (Criteria) this;
        }

        public Criteria andWorkDirectionIn(List<Byte> values) {
            addCriterion("work_direction in", values, "workDirection");
            return (Criteria) this;
        }

        public Criteria andWorkDirectionNotIn(List<Byte> values) {
            addCriterion("work_direction not in", values, "workDirection");
            return (Criteria) this;
        }

        public Criteria andWorkDirectionBetween(Byte value1, Byte value2) {
            addCriterion("work_direction between", value1, value2, "workDirection");
            return (Criteria) this;
        }

        public Criteria andWorkDirectionNotBetween(Byte value1, Byte value2) {
            addCriterion("work_direction not between", value1, value2, "workDirection");
            return (Criteria) this;
        }

        public Criteria andCatIdIsNull() {
            addCriterion("cat_id is null");
            return (Criteria) this;
        }

        public Criteria andCatIdIsNotNull() {
            addCriterion("cat_id is not null");
            return (Criteria) this;
        }

        public Criteria andCatIdEqualTo(Integer value) {
            addCriterion("cat_id =", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotEqualTo(Integer value) {
            addCriterion("cat_id <>", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdGreaterThan(Integer value) {
            addCriterion("cat_id >", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cat_id >=", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdLessThan(Integer value) {
            addCriterion("cat_id <", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdLessThanOrEqualTo(Integer value) {
            addCriterion("cat_id <=", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdIn(List<Integer> values) {
            addCriterion("cat_id in", values, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotIn(List<Integer> values) {
            addCriterion("cat_id not in", values, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdBetween(Integer value1, Integer value2) {
            addCriterion("cat_id between", value1, value2, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cat_id not between", value1, value2, "catId");
            return (Criteria) this;
        }

        public Criteria andCatNameIsNull() {
            addCriterion("cat_name is null");
            return (Criteria) this;
        }

        public Criteria andCatNameIsNotNull() {
            addCriterion("cat_name is not null");
            return (Criteria) this;
        }

        public Criteria andCatNameEqualTo(String value) {
            addCriterion("cat_name =", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameNotEqualTo(String value) {
            addCriterion("cat_name <>", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameGreaterThan(String value) {
            addCriterion("cat_name >", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameGreaterThanOrEqualTo(String value) {
            addCriterion("cat_name >=", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameLessThan(String value) {
            addCriterion("cat_name <", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameLessThanOrEqualTo(String value) {
            addCriterion("cat_name <=", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameLike(String value) {
            addCriterion("cat_name like", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameNotLike(String value) {
            addCriterion("cat_name not like", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameIn(List<String> values) {
            addCriterion("cat_name in", values, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameNotIn(List<String> values) {
            addCriterion("cat_name not in", values, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameBetween(String value1, String value2) {
            addCriterion("cat_name between", value1, value2, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameNotBetween(String value1, String value2) {
            addCriterion("cat_name not between", value1, value2, "catName");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNull() {
            addCriterion("pic_url is null");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNotNull() {
            addCriterion("pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andPicUrlEqualTo(String value) {
            addCriterion("pic_url =", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotEqualTo(String value) {
            addCriterion("pic_url <>", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThan(String value) {
            addCriterion("pic_url >", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pic_url >=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThan(String value) {
            addCriterion("pic_url <", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThanOrEqualTo(String value) {
            addCriterion("pic_url <=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLike(String value) {
            addCriterion("pic_url like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotLike(String value) {
            addCriterion("pic_url not like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlIn(List<String> values) {
            addCriterion("pic_url in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotIn(List<String> values) {
            addCriterion("pic_url not in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlBetween(String value1, String value2) {
            addCriterion("pic_url between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotBetween(String value1, String value2) {
            addCriterion("pic_url not between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNull() {
            addCriterion("book_name is null");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNotNull() {
            addCriterion("book_name is not null");
            return (Criteria) this;
        }

        public Criteria andBookNameEqualTo(String value) {
            addCriterion("book_name =", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotEqualTo(String value) {
            addCriterion("book_name <>", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThan(String value) {
            addCriterion("book_name >", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThanOrEqualTo(String value) {
            addCriterion("book_name >=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThan(String value) {
            addCriterion("book_name <", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThanOrEqualTo(String value) {
            addCriterion("book_name <=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLike(String value) {
            addCriterion("book_name like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotLike(String value) {
            addCriterion("book_name not like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameIn(List<String> values) {
            addCriterion("book_name in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotIn(List<String> values) {
            addCriterion("book_name not in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameBetween(String value1, String value2) {
            addCriterion("book_name between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotBetween(String value1, String value2) {
            addCriterion("book_name not between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIsNull() {
            addCriterion("author_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIsNotNull() {
            addCriterion("author_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdEqualTo(Long value) {
            addCriterion("author_id =", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotEqualTo(Long value) {
            addCriterion("author_id <>", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThan(Long value) {
            addCriterion("author_id >", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("author_id >=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThan(Long value) {
            addCriterion("author_id <", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThanOrEqualTo(Long value) {
            addCriterion("author_id <=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIn(List<Long> values) {
            addCriterion("author_id in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotIn(List<Long> values) {
            addCriterion("author_id not in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdBetween(Long value1, Long value2) {
            addCriterion("author_id between", value1, value2, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotBetween(Long value1, Long value2) {
            addCriterion("author_id not between", value1, value2, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorNameIsNull() {
            addCriterion("author_name is null");
            return (Criteria) this;
        }

        public Criteria andAuthorNameIsNotNull() {
            addCriterion("author_name is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorNameEqualTo(String value) {
            addCriterion("author_name =", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotEqualTo(String value) {
            addCriterion("author_name <>", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameGreaterThan(String value) {
            addCriterion("author_name >", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameGreaterThanOrEqualTo(String value) {
            addCriterion("author_name >=", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameLessThan(String value) {
            addCriterion("author_name <", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameLessThanOrEqualTo(String value) {
            addCriterion("author_name <=", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameLike(String value) {
            addCriterion("author_name like", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotLike(String value) {
            addCriterion("author_name not like", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameIn(List<String> values) {
            addCriterion("author_name in", values, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotIn(List<String> values) {
            addCriterion("author_name not in", values, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameBetween(String value1, String value2) {
            addCriterion("author_name between", value1, value2, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotBetween(String value1, String value2) {
            addCriterion("author_name not between", value1, value2, "authorName");
            return (Criteria) this;
        }

        public Criteria andBookDescIsNull() {
            addCriterion("book_desc is null");
            return (Criteria) this;
        }

        public Criteria andBookDescIsNotNull() {
            addCriterion("book_desc is not null");
            return (Criteria) this;
        }

        public Criteria andBookDescEqualTo(String value) {
            addCriterion("book_desc =", value, "bookDesc");
            return (Criteria) this;
        }

        public Criteria andBookDescNotEqualTo(String value) {
            addCriterion("book_desc <>", value, "bookDesc");
            return (Criteria) this;
        }

        public Criteria andBookDescGreaterThan(String value) {
            addCriterion("book_desc >", value, "bookDesc");
            return (Criteria) this;
        }

        public Criteria andBookDescGreaterThanOrEqualTo(String value) {
            addCriterion("book_desc >=", value, "bookDesc");
            return (Criteria) this;
        }

        public Criteria andBookDescLessThan(String value) {
            addCriterion("book_desc <", value, "bookDesc");
            return (Criteria) this;
        }

        public Criteria andBookDescLessThanOrEqualTo(String value) {
            addCriterion("book_desc <=", value, "bookDesc");
            return (Criteria) this;
        }

        public Criteria andBookDescLike(String value) {
            addCriterion("book_desc like", value, "bookDesc");
            return (Criteria) this;
        }

        public Criteria andBookDescNotLike(String value) {
            addCriterion("book_desc not like", value, "bookDesc");
            return (Criteria) this;
        }

        public Criteria andBookDescIn(List<String> values) {
            addCriterion("book_desc in", values, "bookDesc");
            return (Criteria) this;
        }

        public Criteria andBookDescNotIn(List<String> values) {
            addCriterion("book_desc not in", values, "bookDesc");
            return (Criteria) this;
        }

        public Criteria andBookDescBetween(String value1, String value2) {
            addCriterion("book_desc between", value1, value2, "bookDesc");
            return (Criteria) this;
        }

        public Criteria andBookDescNotBetween(String value1, String value2) {
            addCriterion("book_desc not between", value1, value2, "bookDesc");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Float value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Float value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Float value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Float value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Float value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Float> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Float> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Float value1, Float value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Float value1, Float value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andBookStatusIsNull() {
            addCriterion("book_status is null");
            return (Criteria) this;
        }

        public Criteria andBookStatusIsNotNull() {
            addCriterion("book_status is not null");
            return (Criteria) this;
        }

        public Criteria andBookStatusEqualTo(Byte value) {
            addCriterion("book_status =", value, "bookStatus");
            return (Criteria) this;
        }

        public Criteria andBookStatusNotEqualTo(Byte value) {
            addCriterion("book_status <>", value, "bookStatus");
            return (Criteria) this;
        }

        public Criteria andBookStatusGreaterThan(Byte value) {
            addCriterion("book_status >", value, "bookStatus");
            return (Criteria) this;
        }

        public Criteria andBookStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("book_status >=", value, "bookStatus");
            return (Criteria) this;
        }

        public Criteria andBookStatusLessThan(Byte value) {
            addCriterion("book_status <", value, "bookStatus");
            return (Criteria) this;
        }

        public Criteria andBookStatusLessThanOrEqualTo(Byte value) {
            addCriterion("book_status <=", value, "bookStatus");
            return (Criteria) this;
        }

        public Criteria andBookStatusIn(List<Byte> values) {
            addCriterion("book_status in", values, "bookStatus");
            return (Criteria) this;
        }

        public Criteria andBookStatusNotIn(List<Byte> values) {
            addCriterion("book_status not in", values, "bookStatus");
            return (Criteria) this;
        }

        public Criteria andBookStatusBetween(Byte value1, Byte value2) {
            addCriterion("book_status between", value1, value2, "bookStatus");
            return (Criteria) this;
        }

        public Criteria andBookStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("book_status not between", value1, value2, "bookStatus");
            return (Criteria) this;
        }

        public Criteria andVisitCountIsNull() {
            addCriterion("visit_count is null");
            return (Criteria) this;
        }

        public Criteria andVisitCountIsNotNull() {
            addCriterion("visit_count is not null");
            return (Criteria) this;
        }

        public Criteria andVisitCountEqualTo(Long value) {
            addCriterion("visit_count =", value, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountNotEqualTo(Long value) {
            addCriterion("visit_count <>", value, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountGreaterThan(Long value) {
            addCriterion("visit_count >", value, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountGreaterThanOrEqualTo(Long value) {
            addCriterion("visit_count >=", value, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountLessThan(Long value) {
            addCriterion("visit_count <", value, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountLessThanOrEqualTo(Long value) {
            addCriterion("visit_count <=", value, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountIn(List<Long> values) {
            addCriterion("visit_count in", values, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountNotIn(List<Long> values) {
            addCriterion("visit_count not in", values, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountBetween(Long value1, Long value2) {
            addCriterion("visit_count between", value1, value2, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountNotBetween(Long value1, Long value2) {
            addCriterion("visit_count not between", value1, value2, "visitCount");
            return (Criteria) this;
        }

        public Criteria andWordCountIsNull() {
            addCriterion("word_count is null");
            return (Criteria) this;
        }

        public Criteria andWordCountIsNotNull() {
            addCriterion("word_count is not null");
            return (Criteria) this;
        }

        public Criteria andWordCountEqualTo(Integer value) {
            addCriterion("word_count =", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountNotEqualTo(Integer value) {
            addCriterion("word_count <>", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountGreaterThan(Integer value) {
            addCriterion("word_count >", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("word_count >=", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountLessThan(Integer value) {
            addCriterion("word_count <", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountLessThanOrEqualTo(Integer value) {
            addCriterion("word_count <=", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountIn(List<Integer> values) {
            addCriterion("word_count in", values, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountNotIn(List<Integer> values) {
            addCriterion("word_count not in", values, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountBetween(Integer value1, Integer value2) {
            addCriterion("word_count between", value1, value2, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountNotBetween(Integer value1, Integer value2) {
            addCriterion("word_count not between", value1, value2, "wordCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNull() {
            addCriterion("comment_count is null");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNotNull() {
            addCriterion("comment_count is not null");
            return (Criteria) this;
        }

        public Criteria andCommentCountEqualTo(Integer value) {
            addCriterion("comment_count =", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotEqualTo(Integer value) {
            addCriterion("comment_count <>", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThan(Integer value) {
            addCriterion("comment_count >", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_count >=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThan(Integer value) {
            addCriterion("comment_count <", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThanOrEqualTo(Integer value) {
            addCriterion("comment_count <=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountIn(List<Integer> values) {
            addCriterion("comment_count in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotIn(List<Integer> values) {
            addCriterion("comment_count not in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountBetween(Integer value1, Integer value2) {
            addCriterion("comment_count between", value1, value2, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_count not between", value1, value2, "commentCount");
            return (Criteria) this;
        }

        public Criteria andLastIndexIdIsNull() {
            addCriterion("last_index_id is null");
            return (Criteria) this;
        }

        public Criteria andLastIndexIdIsNotNull() {
            addCriterion("last_index_id is not null");
            return (Criteria) this;
        }

        public Criteria andLastIndexIdEqualTo(Long value) {
            addCriterion("last_index_id =", value, "lastIndexId");
            return (Criteria) this;
        }

        public Criteria andLastIndexIdNotEqualTo(Long value) {
            addCriterion("last_index_id <>", value, "lastIndexId");
            return (Criteria) this;
        }

        public Criteria andLastIndexIdGreaterThan(Long value) {
            addCriterion("last_index_id >", value, "lastIndexId");
            return (Criteria) this;
        }

        public Criteria andLastIndexIdGreaterThanOrEqualTo(Long value) {
            addCriterion("last_index_id >=", value, "lastIndexId");
            return (Criteria) this;
        }

        public Criteria andLastIndexIdLessThan(Long value) {
            addCriterion("last_index_id <", value, "lastIndexId");
            return (Criteria) this;
        }

        public Criteria andLastIndexIdLessThanOrEqualTo(Long value) {
            addCriterion("last_index_id <=", value, "lastIndexId");
            return (Criteria) this;
        }

        public Criteria andLastIndexIdIn(List<Long> values) {
            addCriterion("last_index_id in", values, "lastIndexId");
            return (Criteria) this;
        }

        public Criteria andLastIndexIdNotIn(List<Long> values) {
            addCriterion("last_index_id not in", values, "lastIndexId");
            return (Criteria) this;
        }

        public Criteria andLastIndexIdBetween(Long value1, Long value2) {
            addCriterion("last_index_id between", value1, value2, "lastIndexId");
            return (Criteria) this;
        }

        public Criteria andLastIndexIdNotBetween(Long value1, Long value2) {
            addCriterion("last_index_id not between", value1, value2, "lastIndexId");
            return (Criteria) this;
        }

        public Criteria andLastIndexNameIsNull() {
            addCriterion("last_index_name is null");
            return (Criteria) this;
        }

        public Criteria andLastIndexNameIsNotNull() {
            addCriterion("last_index_name is not null");
            return (Criteria) this;
        }

        public Criteria andLastIndexNameEqualTo(String value) {
            addCriterion("last_index_name =", value, "lastIndexName");
            return (Criteria) this;
        }

        public Criteria andLastIndexNameNotEqualTo(String value) {
            addCriterion("last_index_name <>", value, "lastIndexName");
            return (Criteria) this;
        }

        public Criteria andLastIndexNameGreaterThan(String value) {
            addCriterion("last_index_name >", value, "lastIndexName");
            return (Criteria) this;
        }

        public Criteria andLastIndexNameGreaterThanOrEqualTo(String value) {
            addCriterion("last_index_name >=", value, "lastIndexName");
            return (Criteria) this;
        }

        public Criteria andLastIndexNameLessThan(String value) {
            addCriterion("last_index_name <", value, "lastIndexName");
            return (Criteria) this;
        }

        public Criteria andLastIndexNameLessThanOrEqualTo(String value) {
            addCriterion("last_index_name <=", value, "lastIndexName");
            return (Criteria) this;
        }

        public Criteria andLastIndexNameLike(String value) {
            addCriterion("last_index_name like", value, "lastIndexName");
            return (Criteria) this;
        }

        public Criteria andLastIndexNameNotLike(String value) {
            addCriterion("last_index_name not like", value, "lastIndexName");
            return (Criteria) this;
        }

        public Criteria andLastIndexNameIn(List<String> values) {
            addCriterion("last_index_name in", values, "lastIndexName");
            return (Criteria) this;
        }

        public Criteria andLastIndexNameNotIn(List<String> values) {
            addCriterion("last_index_name not in", values, "lastIndexName");
            return (Criteria) this;
        }

        public Criteria andLastIndexNameBetween(String value1, String value2) {
            addCriterion("last_index_name between", value1, value2, "lastIndexName");
            return (Criteria) this;
        }

        public Criteria andLastIndexNameNotBetween(String value1, String value2) {
            addCriterion("last_index_name not between", value1, value2, "lastIndexName");
            return (Criteria) this;
        }

        public Criteria andLastIndexUpdateTimeIsNull() {
            addCriterion("last_index_update_time is null");
            return (Criteria) this;
        }

        public Criteria andLastIndexUpdateTimeIsNotNull() {
            addCriterion("last_index_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastIndexUpdateTimeEqualTo(Date value) {
            addCriterion("last_index_update_time =", value, "lastIndexUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastIndexUpdateTimeNotEqualTo(Date value) {
            addCriterion("last_index_update_time <>", value, "lastIndexUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastIndexUpdateTimeGreaterThan(Date value) {
            addCriterion("last_index_update_time >", value, "lastIndexUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastIndexUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_index_update_time >=", value, "lastIndexUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastIndexUpdateTimeLessThan(Date value) {
            addCriterion("last_index_update_time <", value, "lastIndexUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastIndexUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_index_update_time <=", value, "lastIndexUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastIndexUpdateTimeIn(List<Date> values) {
            addCriterion("last_index_update_time in", values, "lastIndexUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastIndexUpdateTimeNotIn(List<Date> values) {
            addCriterion("last_index_update_time not in", values, "lastIndexUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastIndexUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("last_index_update_time between", value1, value2, "lastIndexUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastIndexUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_index_update_time not between", value1, value2, "lastIndexUpdateTime");
            return (Criteria) this;
        }

        public Criteria andIsVipIsNull() {
            addCriterion("is_vip is null");
            return (Criteria) this;
        }

        public Criteria andIsVipIsNotNull() {
            addCriterion("is_vip is not null");
            return (Criteria) this;
        }

        public Criteria andIsVipEqualTo(Byte value) {
            addCriterion("is_vip =", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipNotEqualTo(Byte value) {
            addCriterion("is_vip <>", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipGreaterThan(Byte value) {
            addCriterion("is_vip >", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_vip >=", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipLessThan(Byte value) {
            addCriterion("is_vip <", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipLessThanOrEqualTo(Byte value) {
            addCriterion("is_vip <=", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipIn(List<Byte> values) {
            addCriterion("is_vip in", values, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipNotIn(List<Byte> values) {
            addCriterion("is_vip not in", values, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipBetween(Byte value1, Byte value2) {
            addCriterion("is_vip between", value1, value2, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipNotBetween(Byte value1, Byte value2) {
            addCriterion("is_vip not between", value1, value2, "isVip");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCrawlSourceIdIsNull() {
            addCriterion("crawl_source_id is null");
            return (Criteria) this;
        }

        public Criteria andCrawlSourceIdIsNotNull() {
            addCriterion("crawl_source_id is not null");
            return (Criteria) this;
        }

        public Criteria andCrawlSourceIdEqualTo(Integer value) {
            addCriterion("crawl_source_id =", value, "crawlSourceId");
            return (Criteria) this;
        }

        public Criteria andCrawlSourceIdNotEqualTo(Integer value) {
            addCriterion("crawl_source_id <>", value, "crawlSourceId");
            return (Criteria) this;
        }

        public Criteria andCrawlSourceIdGreaterThan(Integer value) {
            addCriterion("crawl_source_id >", value, "crawlSourceId");
            return (Criteria) this;
        }

        public Criteria andCrawlSourceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("crawl_source_id >=", value, "crawlSourceId");
            return (Criteria) this;
        }

        public Criteria andCrawlSourceIdLessThan(Integer value) {
            addCriterion("crawl_source_id <", value, "crawlSourceId");
            return (Criteria) this;
        }

        public Criteria andCrawlSourceIdLessThanOrEqualTo(Integer value) {
            addCriterion("crawl_source_id <=", value, "crawlSourceId");
            return (Criteria) this;
        }

        public Criteria andCrawlSourceIdIn(List<Integer> values) {
            addCriterion("crawl_source_id in", values, "crawlSourceId");
            return (Criteria) this;
        }

        public Criteria andCrawlSourceIdNotIn(List<Integer> values) {
            addCriterion("crawl_source_id not in", values, "crawlSourceId");
            return (Criteria) this;
        }

        public Criteria andCrawlSourceIdBetween(Integer value1, Integer value2) {
            addCriterion("crawl_source_id between", value1, value2, "crawlSourceId");
            return (Criteria) this;
        }

        public Criteria andCrawlSourceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("crawl_source_id not between", value1, value2, "crawlSourceId");
            return (Criteria) this;
        }

        public Criteria andCrawlBookIdIsNull() {
            addCriterion("crawl_book_id is null");
            return (Criteria) this;
        }

        public Criteria andCrawlBookIdIsNotNull() {
            addCriterion("crawl_book_id is not null");
            return (Criteria) this;
        }

        public Criteria andCrawlBookIdEqualTo(String value) {
            addCriterion("crawl_book_id =", value, "crawlBookId");
            return (Criteria) this;
        }

        public Criteria andCrawlBookIdNotEqualTo(String value) {
            addCriterion("crawl_book_id <>", value, "crawlBookId");
            return (Criteria) this;
        }

        public Criteria andCrawlBookIdGreaterThan(String value) {
            addCriterion("crawl_book_id >", value, "crawlBookId");
            return (Criteria) this;
        }

        public Criteria andCrawlBookIdGreaterThanOrEqualTo(String value) {
            addCriterion("crawl_book_id >=", value, "crawlBookId");
            return (Criteria) this;
        }

        public Criteria andCrawlBookIdLessThan(String value) {
            addCriterion("crawl_book_id <", value, "crawlBookId");
            return (Criteria) this;
        }

        public Criteria andCrawlBookIdLessThanOrEqualTo(String value) {
            addCriterion("crawl_book_id <=", value, "crawlBookId");
            return (Criteria) this;
        }

        public Criteria andCrawlBookIdLike(String value) {
            addCriterion("crawl_book_id like", value, "crawlBookId");
            return (Criteria) this;
        }

        public Criteria andCrawlBookIdNotLike(String value) {
            addCriterion("crawl_book_id not like", value, "crawlBookId");
            return (Criteria) this;
        }

        public Criteria andCrawlBookIdIn(List<String> values) {
            addCriterion("crawl_book_id in", values, "crawlBookId");
            return (Criteria) this;
        }

        public Criteria andCrawlBookIdNotIn(List<String> values) {
            addCriterion("crawl_book_id not in", values, "crawlBookId");
            return (Criteria) this;
        }

        public Criteria andCrawlBookIdBetween(String value1, String value2) {
            addCriterion("crawl_book_id between", value1, value2, "crawlBookId");
            return (Criteria) this;
        }

        public Criteria andCrawlBookIdNotBetween(String value1, String value2) {
            addCriterion("crawl_book_id not between", value1, value2, "crawlBookId");
            return (Criteria) this;
        }

        public Criteria andCrawlLastTimeIsNull() {
            addCriterion("crawl_last_time is null");
            return (Criteria) this;
        }

        public Criteria andCrawlLastTimeIsNotNull() {
            addCriterion("crawl_last_time is not null");
            return (Criteria) this;
        }

        public Criteria andCrawlLastTimeEqualTo(Date value) {
            addCriterion("crawl_last_time =", value, "crawlLastTime");
            return (Criteria) this;
        }

        public Criteria andCrawlLastTimeNotEqualTo(Date value) {
            addCriterion("crawl_last_time <>", value, "crawlLastTime");
            return (Criteria) this;
        }

        public Criteria andCrawlLastTimeGreaterThan(Date value) {
            addCriterion("crawl_last_time >", value, "crawlLastTime");
            return (Criteria) this;
        }

        public Criteria andCrawlLastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("crawl_last_time >=", value, "crawlLastTime");
            return (Criteria) this;
        }

        public Criteria andCrawlLastTimeLessThan(Date value) {
            addCriterion("crawl_last_time <", value, "crawlLastTime");
            return (Criteria) this;
        }

        public Criteria andCrawlLastTimeLessThanOrEqualTo(Date value) {
            addCriterion("crawl_last_time <=", value, "crawlLastTime");
            return (Criteria) this;
        }

        public Criteria andCrawlLastTimeIn(List<Date> values) {
            addCriterion("crawl_last_time in", values, "crawlLastTime");
            return (Criteria) this;
        }

        public Criteria andCrawlLastTimeNotIn(List<Date> values) {
            addCriterion("crawl_last_time not in", values, "crawlLastTime");
            return (Criteria) this;
        }

        public Criteria andCrawlLastTimeBetween(Date value1, Date value2) {
            addCriterion("crawl_last_time between", value1, value2, "crawlLastTime");
            return (Criteria) this;
        }

        public Criteria andCrawlLastTimeNotBetween(Date value1, Date value2) {
            addCriterion("crawl_last_time not between", value1, value2, "crawlLastTime");
            return (Criteria) this;
        }

        public Criteria andCrawlIsStopIsNull() {
            addCriterion("crawl_is_stop is null");
            return (Criteria) this;
        }

        public Criteria andCrawlIsStopIsNotNull() {
            addCriterion("crawl_is_stop is not null");
            return (Criteria) this;
        }

        public Criteria andCrawlIsStopEqualTo(Byte value) {
            addCriterion("crawl_is_stop =", value, "crawlIsStop");
            return (Criteria) this;
        }

        public Criteria andCrawlIsStopNotEqualTo(Byte value) {
            addCriterion("crawl_is_stop <>", value, "crawlIsStop");
            return (Criteria) this;
        }

        public Criteria andCrawlIsStopGreaterThan(Byte value) {
            addCriterion("crawl_is_stop >", value, "crawlIsStop");
            return (Criteria) this;
        }

        public Criteria andCrawlIsStopGreaterThanOrEqualTo(Byte value) {
            addCriterion("crawl_is_stop >=", value, "crawlIsStop");
            return (Criteria) this;
        }

        public Criteria andCrawlIsStopLessThan(Byte value) {
            addCriterion("crawl_is_stop <", value, "crawlIsStop");
            return (Criteria) this;
        }

        public Criteria andCrawlIsStopLessThanOrEqualTo(Byte value) {
            addCriterion("crawl_is_stop <=", value, "crawlIsStop");
            return (Criteria) this;
        }

        public Criteria andCrawlIsStopIn(List<Byte> values) {
            addCriterion("crawl_is_stop in", values, "crawlIsStop");
            return (Criteria) this;
        }

        public Criteria andCrawlIsStopNotIn(List<Byte> values) {
            addCriterion("crawl_is_stop not in", values, "crawlIsStop");
            return (Criteria) this;
        }

        public Criteria andCrawlIsStopBetween(Byte value1, Byte value2) {
            addCriterion("crawl_is_stop between", value1, value2, "crawlIsStop");
            return (Criteria) this;
        }

        public Criteria andCrawlIsStopNotBetween(Byte value1, Byte value2) {
            addCriterion("crawl_is_stop not between", value1, value2, "crawlIsStop");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}