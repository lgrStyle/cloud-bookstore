package io.bookstore.gen.all.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;

import io.bookstore.gen.all.entity.UserBookshelf;
import java.util.List;
import javax.annotation.Generated;

import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.delete.DeleteDSL;
import org.mybatis.dynamic.sql.delete.MyBatis3DeleteModelAdapter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.MyBatis3SelectModelAdapter;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectDSL;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.MyBatis3UpdateModelAdapter;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;

@Mapper
public interface UserBookshelfMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<UserBookshelf> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UserBookshelfResult")
    UserBookshelf selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UserBookshelfResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="book_id", property="bookId", jdbcType=JdbcType.BIGINT),
        @Result(column="pre_content_id", property="preContentId", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserBookshelf> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(UserBookshelfDynamicSqlSupport.userBookshelf);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, UserBookshelfDynamicSqlSupport.userBookshelf);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, UserBookshelfDynamicSqlSupport.userBookshelf)
                .where(UserBookshelfDynamicSqlSupport.id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(UserBookshelf record) {
        return insert(SqlBuilder.insert(record)
                .into(UserBookshelfDynamicSqlSupport.userBookshelf)
                .map(UserBookshelfDynamicSqlSupport.id).toProperty("id")
                .map(UserBookshelfDynamicSqlSupport.userId).toProperty("userId")
                .map(UserBookshelfDynamicSqlSupport.bookId).toProperty("bookId")
                .map(UserBookshelfDynamicSqlSupport.preContentId).toProperty("preContentId")
                .map(UserBookshelfDynamicSqlSupport.createTime).toProperty("createTime")
                .map(UserBookshelfDynamicSqlSupport.updateTime).toProperty("updateTime")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(UserBookshelf record) {
        return insert(SqlBuilder.insert(record)
                .into(UserBookshelfDynamicSqlSupport.userBookshelf)
                .map(UserBookshelfDynamicSqlSupport.id).toPropertyWhenPresent("id", record::getId)
                .map(UserBookshelfDynamicSqlSupport.userId).toPropertyWhenPresent("userId", record::getUserId)
                .map(UserBookshelfDynamicSqlSupport.bookId).toPropertyWhenPresent("bookId", record::getBookId)
                .map(UserBookshelfDynamicSqlSupport.preContentId).toPropertyWhenPresent("preContentId", record::getPreContentId)
                .map(UserBookshelfDynamicSqlSupport.createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(UserBookshelfDynamicSqlSupport.updateTime).toPropertyWhenPresent("updateTime", record::getUpdateTime)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<UserBookshelf>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, UserBookshelfDynamicSqlSupport.id, UserBookshelfDynamicSqlSupport.userId, UserBookshelfDynamicSqlSupport.bookId, UserBookshelfDynamicSqlSupport.preContentId, UserBookshelfDynamicSqlSupport.createTime, UserBookshelfDynamicSqlSupport.updateTime)
                .from(UserBookshelfDynamicSqlSupport.userBookshelf);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<UserBookshelf>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, UserBookshelfDynamicSqlSupport.id, UserBookshelfDynamicSqlSupport.userId, UserBookshelfDynamicSqlSupport.bookId, UserBookshelfDynamicSqlSupport.preContentId, UserBookshelfDynamicSqlSupport.createTime, UserBookshelfDynamicSqlSupport.updateTime)
                .from(UserBookshelfDynamicSqlSupport.userBookshelf);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UserBookshelf selectByPrimaryKey(Long id_) {
        return SelectDSL.selectWithMapper(this::selectOne, UserBookshelfDynamicSqlSupport.id, UserBookshelfDynamicSqlSupport.userId, UserBookshelfDynamicSqlSupport.bookId, UserBookshelfDynamicSqlSupport.preContentId, UserBookshelfDynamicSqlSupport.createTime, UserBookshelfDynamicSqlSupport.updateTime)
                .from(UserBookshelfDynamicSqlSupport.userBookshelf)
                .where(UserBookshelfDynamicSqlSupport.id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(UserBookshelf record) {
        return UpdateDSL.updateWithMapper(this::update, UserBookshelfDynamicSqlSupport.userBookshelf)
                .set(UserBookshelfDynamicSqlSupport.id).equalTo(record::getId)
                .set(UserBookshelfDynamicSqlSupport.userId).equalTo(record::getUserId)
                .set(UserBookshelfDynamicSqlSupport.bookId).equalTo(record::getBookId)
                .set(UserBookshelfDynamicSqlSupport.preContentId).equalTo(record::getPreContentId)
                .set(UserBookshelfDynamicSqlSupport.createTime).equalTo(record::getCreateTime)
                .set(UserBookshelfDynamicSqlSupport.updateTime).equalTo(record::getUpdateTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(UserBookshelf record) {
        return UpdateDSL.updateWithMapper(this::update, UserBookshelfDynamicSqlSupport.userBookshelf)
                .set(UserBookshelfDynamicSqlSupport.id).equalToWhenPresent(record::getId)
                .set(UserBookshelfDynamicSqlSupport.userId).equalToWhenPresent(record::getUserId)
                .set(UserBookshelfDynamicSqlSupport.bookId).equalToWhenPresent(record::getBookId)
                .set(UserBookshelfDynamicSqlSupport.preContentId).equalToWhenPresent(record::getPreContentId)
                .set(UserBookshelfDynamicSqlSupport.createTime).equalToWhenPresent(record::getCreateTime)
                .set(UserBookshelfDynamicSqlSupport.updateTime).equalToWhenPresent(record::getUpdateTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(UserBookshelf record) {
        return UpdateDSL.updateWithMapper(this::update, UserBookshelfDynamicSqlSupport.userBookshelf)
                .set(UserBookshelfDynamicSqlSupport.userId).equalTo(record::getUserId)
                .set(UserBookshelfDynamicSqlSupport.bookId).equalTo(record::getBookId)
                .set(UserBookshelfDynamicSqlSupport.preContentId).equalTo(record::getPreContentId)
                .set(UserBookshelfDynamicSqlSupport.createTime).equalTo(record::getCreateTime)
                .set(UserBookshelfDynamicSqlSupport.updateTime).equalTo(record::getUpdateTime)
                .where(UserBookshelfDynamicSqlSupport.id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(UserBookshelf record) {
        return UpdateDSL.updateWithMapper(this::update, UserBookshelfDynamicSqlSupport.userBookshelf)
                .set(UserBookshelfDynamicSqlSupport.userId).equalToWhenPresent(record::getUserId)
                .set(UserBookshelfDynamicSqlSupport.bookId).equalToWhenPresent(record::getBookId)
                .set(UserBookshelfDynamicSqlSupport.preContentId).equalToWhenPresent(record::getPreContentId)
                .set(UserBookshelfDynamicSqlSupport.createTime).equalToWhenPresent(record::getCreateTime)
                .set(UserBookshelfDynamicSqlSupport.updateTime).equalToWhenPresent(record::getUpdateTime)
                .where(UserBookshelfDynamicSqlSupport.id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}