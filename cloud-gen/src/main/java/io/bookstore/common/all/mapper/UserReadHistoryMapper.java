package io.bookstore.common.all.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;

import io.bookstore.common.all.entity.UserReadHistory;
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
public interface UserReadHistoryMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<UserReadHistory> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UserReadHistoryResult")
    UserReadHistory selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UserReadHistoryResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="book_id", property="bookId", jdbcType=JdbcType.BIGINT),
        @Result(column="pre_content_id", property="preContentId", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserReadHistory> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(UserReadHistoryDynamicSqlSupport.userReadHistory);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, UserReadHistoryDynamicSqlSupport.userReadHistory);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, UserReadHistoryDynamicSqlSupport.userReadHistory)
                .where(UserReadHistoryDynamicSqlSupport.id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(UserReadHistory record) {
        return insert(SqlBuilder.insert(record)
                .into(UserReadHistoryDynamicSqlSupport.userReadHistory)
                .map(UserReadHistoryDynamicSqlSupport.id).toProperty("id")
                .map(UserReadHistoryDynamicSqlSupport.userId).toProperty("userId")
                .map(UserReadHistoryDynamicSqlSupport.bookId).toProperty("bookId")
                .map(UserReadHistoryDynamicSqlSupport.preContentId).toProperty("preContentId")
                .map(UserReadHistoryDynamicSqlSupport.createTime).toProperty("createTime")
                .map(UserReadHistoryDynamicSqlSupport.updateTime).toProperty("updateTime")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(UserReadHistory record) {
        return insert(SqlBuilder.insert(record)
                .into(UserReadHistoryDynamicSqlSupport.userReadHistory)
                .map(UserReadHistoryDynamicSqlSupport.id).toPropertyWhenPresent("id", record::getId)
                .map(UserReadHistoryDynamicSqlSupport.userId).toPropertyWhenPresent("userId", record::getUserId)
                .map(UserReadHistoryDynamicSqlSupport.bookId).toPropertyWhenPresent("bookId", record::getBookId)
                .map(UserReadHistoryDynamicSqlSupport.preContentId).toPropertyWhenPresent("preContentId", record::getPreContentId)
                .map(UserReadHistoryDynamicSqlSupport.createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(UserReadHistoryDynamicSqlSupport.updateTime).toPropertyWhenPresent("updateTime", record::getUpdateTime)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<UserReadHistory>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, UserReadHistoryDynamicSqlSupport.id, UserReadHistoryDynamicSqlSupport.userId, UserReadHistoryDynamicSqlSupport.bookId, UserReadHistoryDynamicSqlSupport.preContentId, UserReadHistoryDynamicSqlSupport.createTime, UserReadHistoryDynamicSqlSupport.updateTime)
                .from(UserReadHistoryDynamicSqlSupport.userReadHistory);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<UserReadHistory>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, UserReadHistoryDynamicSqlSupport.id, UserReadHistoryDynamicSqlSupport.userId, UserReadHistoryDynamicSqlSupport.bookId, UserReadHistoryDynamicSqlSupport.preContentId, UserReadHistoryDynamicSqlSupport.createTime, UserReadHistoryDynamicSqlSupport.updateTime)
                .from(UserReadHistoryDynamicSqlSupport.userReadHistory);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UserReadHistory selectByPrimaryKey(Long id_) {
        return SelectDSL.selectWithMapper(this::selectOne, UserReadHistoryDynamicSqlSupport.id, UserReadHistoryDynamicSqlSupport.userId, UserReadHistoryDynamicSqlSupport.bookId, UserReadHistoryDynamicSqlSupport.preContentId, UserReadHistoryDynamicSqlSupport.createTime, UserReadHistoryDynamicSqlSupport.updateTime)
                .from(UserReadHistoryDynamicSqlSupport.userReadHistory)
                .where(UserReadHistoryDynamicSqlSupport.id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(UserReadHistory record) {
        return UpdateDSL.updateWithMapper(this::update, UserReadHistoryDynamicSqlSupport.userReadHistory)
                .set(UserReadHistoryDynamicSqlSupport.id).equalTo(record::getId)
                .set(UserReadHistoryDynamicSqlSupport.userId).equalTo(record::getUserId)
                .set(UserReadHistoryDynamicSqlSupport.bookId).equalTo(record::getBookId)
                .set(UserReadHistoryDynamicSqlSupport.preContentId).equalTo(record::getPreContentId)
                .set(UserReadHistoryDynamicSqlSupport.createTime).equalTo(record::getCreateTime)
                .set(UserReadHistoryDynamicSqlSupport.updateTime).equalTo(record::getUpdateTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(UserReadHistory record) {
        return UpdateDSL.updateWithMapper(this::update, UserReadHistoryDynamicSqlSupport.userReadHistory)
                .set(UserReadHistoryDynamicSqlSupport.id).equalToWhenPresent(record::getId)
                .set(UserReadHistoryDynamicSqlSupport.userId).equalToWhenPresent(record::getUserId)
                .set(UserReadHistoryDynamicSqlSupport.bookId).equalToWhenPresent(record::getBookId)
                .set(UserReadHistoryDynamicSqlSupport.preContentId).equalToWhenPresent(record::getPreContentId)
                .set(UserReadHistoryDynamicSqlSupport.createTime).equalToWhenPresent(record::getCreateTime)
                .set(UserReadHistoryDynamicSqlSupport.updateTime).equalToWhenPresent(record::getUpdateTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(UserReadHistory record) {
        return UpdateDSL.updateWithMapper(this::update, UserReadHistoryDynamicSqlSupport.userReadHistory)
                .set(UserReadHistoryDynamicSqlSupport.userId).equalTo(record::getUserId)
                .set(UserReadHistoryDynamicSqlSupport.bookId).equalTo(record::getBookId)
                .set(UserReadHistoryDynamicSqlSupport.preContentId).equalTo(record::getPreContentId)
                .set(UserReadHistoryDynamicSqlSupport.createTime).equalTo(record::getCreateTime)
                .set(UserReadHistoryDynamicSqlSupport.updateTime).equalTo(record::getUpdateTime)
                .where(UserReadHistoryDynamicSqlSupport.id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(UserReadHistory record) {
        return UpdateDSL.updateWithMapper(this::update, UserReadHistoryDynamicSqlSupport.userReadHistory)
                .set(UserReadHistoryDynamicSqlSupport.userId).equalToWhenPresent(record::getUserId)
                .set(UserReadHistoryDynamicSqlSupport.bookId).equalToWhenPresent(record::getBookId)
                .set(UserReadHistoryDynamicSqlSupport.preContentId).equalToWhenPresent(record::getPreContentId)
                .set(UserReadHistoryDynamicSqlSupport.createTime).equalToWhenPresent(record::getCreateTime)
                .set(UserReadHistoryDynamicSqlSupport.updateTime).equalToWhenPresent(record::getUpdateTime)
                .where(UserReadHistoryDynamicSqlSupport.id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}