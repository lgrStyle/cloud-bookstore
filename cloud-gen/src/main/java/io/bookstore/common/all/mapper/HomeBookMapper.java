package io.bookstore.common.all.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;

import io.bookstore.common.all.entity.HomeBook;
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
public interface HomeBookMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<HomeBook> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("HomeBookResult")
    HomeBook selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="HomeBookResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="book_id", property="bookId", jdbcType=JdbcType.BIGINT),
        @Result(column="sort", property="sort", jdbcType=JdbcType.TINYINT),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_user_id", property="createUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_user_id", property="updateUserId", jdbcType=JdbcType.BIGINT)
    })
    List<HomeBook> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(HomeBookDynamicSqlSupport.homeBook);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, HomeBookDynamicSqlSupport.homeBook);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, HomeBookDynamicSqlSupport.homeBook)
                .where(HomeBookDynamicSqlSupport.id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(HomeBook record) {
        return insert(SqlBuilder.insert(record)
                .into(HomeBookDynamicSqlSupport.homeBook)
                .map(HomeBookDynamicSqlSupport.id).toProperty("id")
                .map(HomeBookDynamicSqlSupport.bookId).toProperty("bookId")
                .map(HomeBookDynamicSqlSupport.sort).toProperty("sort")
                .map(HomeBookDynamicSqlSupport.type).toProperty("type")
                .map(HomeBookDynamicSqlSupport.createTime).toProperty("createTime")
                .map(HomeBookDynamicSqlSupport.createUserId).toProperty("createUserId")
                .map(HomeBookDynamicSqlSupport.updateTime).toProperty("updateTime")
                .map(HomeBookDynamicSqlSupport.updateUserId).toProperty("updateUserId")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(HomeBook record) {
        return insert(SqlBuilder.insert(record)
                .into(HomeBookDynamicSqlSupport.homeBook)
                .map(HomeBookDynamicSqlSupport.id).toPropertyWhenPresent("id", record::getId)
                .map(HomeBookDynamicSqlSupport.bookId).toPropertyWhenPresent("bookId", record::getBookId)
                .map(HomeBookDynamicSqlSupport.sort).toPropertyWhenPresent("sort", record::getSort)
                .map(HomeBookDynamicSqlSupport.type).toPropertyWhenPresent("type", record::getType)
                .map(HomeBookDynamicSqlSupport.createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(HomeBookDynamicSqlSupport.createUserId).toPropertyWhenPresent("createUserId", record::getCreateUserId)
                .map(HomeBookDynamicSqlSupport.updateTime).toPropertyWhenPresent("updateTime", record::getUpdateTime)
                .map(HomeBookDynamicSqlSupport.updateUserId).toPropertyWhenPresent("updateUserId", record::getUpdateUserId)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<HomeBook>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, HomeBookDynamicSqlSupport.id, HomeBookDynamicSqlSupport.bookId, HomeBookDynamicSqlSupport.sort, HomeBookDynamicSqlSupport.type, HomeBookDynamicSqlSupport.createTime, HomeBookDynamicSqlSupport.createUserId, HomeBookDynamicSqlSupport.updateTime, HomeBookDynamicSqlSupport.updateUserId)
                .from(HomeBookDynamicSqlSupport.homeBook);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<HomeBook>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, HomeBookDynamicSqlSupport.id, HomeBookDynamicSqlSupport.bookId, HomeBookDynamicSqlSupport.sort, HomeBookDynamicSqlSupport.type, HomeBookDynamicSqlSupport.createTime, HomeBookDynamicSqlSupport.createUserId, HomeBookDynamicSqlSupport.updateTime, HomeBookDynamicSqlSupport.updateUserId)
                .from(HomeBookDynamicSqlSupport.homeBook);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default HomeBook selectByPrimaryKey(Long id_) {
        return SelectDSL.selectWithMapper(this::selectOne, HomeBookDynamicSqlSupport.id, HomeBookDynamicSqlSupport.bookId, HomeBookDynamicSqlSupport.sort, HomeBookDynamicSqlSupport.type, HomeBookDynamicSqlSupport.createTime, HomeBookDynamicSqlSupport.createUserId, HomeBookDynamicSqlSupport.updateTime, HomeBookDynamicSqlSupport.updateUserId)
                .from(HomeBookDynamicSqlSupport.homeBook)
                .where(HomeBookDynamicSqlSupport.id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(HomeBook record) {
        return UpdateDSL.updateWithMapper(this::update, HomeBookDynamicSqlSupport.homeBook)
                .set(HomeBookDynamicSqlSupport.id).equalTo(record::getId)
                .set(HomeBookDynamicSqlSupport.bookId).equalTo(record::getBookId)
                .set(HomeBookDynamicSqlSupport.sort).equalTo(record::getSort)
                .set(HomeBookDynamicSqlSupport.type).equalTo(record::getType)
                .set(HomeBookDynamicSqlSupport.createTime).equalTo(record::getCreateTime)
                .set(HomeBookDynamicSqlSupport.createUserId).equalTo(record::getCreateUserId)
                .set(HomeBookDynamicSqlSupport.updateTime).equalTo(record::getUpdateTime)
                .set(HomeBookDynamicSqlSupport.updateUserId).equalTo(record::getUpdateUserId);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(HomeBook record) {
        return UpdateDSL.updateWithMapper(this::update, HomeBookDynamicSqlSupport.homeBook)
                .set(HomeBookDynamicSqlSupport.id).equalToWhenPresent(record::getId)
                .set(HomeBookDynamicSqlSupport.bookId).equalToWhenPresent(record::getBookId)
                .set(HomeBookDynamicSqlSupport.sort).equalToWhenPresent(record::getSort)
                .set(HomeBookDynamicSqlSupport.type).equalToWhenPresent(record::getType)
                .set(HomeBookDynamicSqlSupport.createTime).equalToWhenPresent(record::getCreateTime)
                .set(HomeBookDynamicSqlSupport.createUserId).equalToWhenPresent(record::getCreateUserId)
                .set(HomeBookDynamicSqlSupport.updateTime).equalToWhenPresent(record::getUpdateTime)
                .set(HomeBookDynamicSqlSupport.updateUserId).equalToWhenPresent(record::getUpdateUserId);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(HomeBook record) {
        return UpdateDSL.updateWithMapper(this::update, HomeBookDynamicSqlSupport.homeBook)
                .set(HomeBookDynamicSqlSupport.bookId).equalTo(record::getBookId)
                .set(HomeBookDynamicSqlSupport.sort).equalTo(record::getSort)
                .set(HomeBookDynamicSqlSupport.type).equalTo(record::getType)
                .set(HomeBookDynamicSqlSupport.createTime).equalTo(record::getCreateTime)
                .set(HomeBookDynamicSqlSupport.createUserId).equalTo(record::getCreateUserId)
                .set(HomeBookDynamicSqlSupport.updateTime).equalTo(record::getUpdateTime)
                .set(HomeBookDynamicSqlSupport.updateUserId).equalTo(record::getUpdateUserId)
                .where(HomeBookDynamicSqlSupport.id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(HomeBook record) {
        return UpdateDSL.updateWithMapper(this::update, HomeBookDynamicSqlSupport.homeBook)
                .set(HomeBookDynamicSqlSupport.bookId).equalToWhenPresent(record::getBookId)
                .set(HomeBookDynamicSqlSupport.sort).equalToWhenPresent(record::getSort)
                .set(HomeBookDynamicSqlSupport.type).equalToWhenPresent(record::getType)
                .set(HomeBookDynamicSqlSupport.createTime).equalToWhenPresent(record::getCreateTime)
                .set(HomeBookDynamicSqlSupport.createUserId).equalToWhenPresent(record::getCreateUserId)
                .set(HomeBookDynamicSqlSupport.updateTime).equalToWhenPresent(record::getUpdateTime)
                .set(HomeBookDynamicSqlSupport.updateUserId).equalToWhenPresent(record::getUpdateUserId)
                .where(HomeBookDynamicSqlSupport.id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}