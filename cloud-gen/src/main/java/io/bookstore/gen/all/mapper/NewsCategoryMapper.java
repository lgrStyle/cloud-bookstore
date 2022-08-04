package io.bookstore.gen.all.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;

import io.bookstore.gen.all.entity.NewsCategory;
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
public interface NewsCategoryMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<NewsCategory> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("NewsCategoryResult")
    NewsCategory selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="NewsCategoryResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.TINYINT),
        @Result(column="create_user_id", property="createUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_user_id", property="updateUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<NewsCategory> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(NewsCategoryDynamicSqlSupport.newsCategory);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, NewsCategoryDynamicSqlSupport.newsCategory);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, NewsCategoryDynamicSqlSupport.newsCategory)
                .where(NewsCategoryDynamicSqlSupport.id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(NewsCategory record) {
        return insert(SqlBuilder.insert(record)
                .into(NewsCategoryDynamicSqlSupport.newsCategory)
                .map(NewsCategoryDynamicSqlSupport.id).toProperty("id")
                .map(NewsCategoryDynamicSqlSupport.name).toProperty("name")
                .map(NewsCategoryDynamicSqlSupport.sort).toProperty("sort")
                .map(NewsCategoryDynamicSqlSupport.createUserId).toProperty("createUserId")
                .map(NewsCategoryDynamicSqlSupport.createTime).toProperty("createTime")
                .map(NewsCategoryDynamicSqlSupport.updateUserId).toProperty("updateUserId")
                .map(NewsCategoryDynamicSqlSupport.updateTime).toProperty("updateTime")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(NewsCategory record) {
        return insert(SqlBuilder.insert(record)
                .into(NewsCategoryDynamicSqlSupport.newsCategory)
                .map(NewsCategoryDynamicSqlSupport.id).toPropertyWhenPresent("id", record::getId)
                .map(NewsCategoryDynamicSqlSupport.name).toPropertyWhenPresent("name", record::getName)
                .map(NewsCategoryDynamicSqlSupport.sort).toPropertyWhenPresent("sort", record::getSort)
                .map(NewsCategoryDynamicSqlSupport.createUserId).toPropertyWhenPresent("createUserId", record::getCreateUserId)
                .map(NewsCategoryDynamicSqlSupport.createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(NewsCategoryDynamicSqlSupport.updateUserId).toPropertyWhenPresent("updateUserId", record::getUpdateUserId)
                .map(NewsCategoryDynamicSqlSupport.updateTime).toPropertyWhenPresent("updateTime", record::getUpdateTime)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<NewsCategory>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, NewsCategoryDynamicSqlSupport.id, NewsCategoryDynamicSqlSupport.name, NewsCategoryDynamicSqlSupport.sort, NewsCategoryDynamicSqlSupport.createUserId, NewsCategoryDynamicSqlSupport.createTime, NewsCategoryDynamicSqlSupport.updateUserId, NewsCategoryDynamicSqlSupport.updateTime)
                .from(NewsCategoryDynamicSqlSupport.newsCategory);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<NewsCategory>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, NewsCategoryDynamicSqlSupport.id, NewsCategoryDynamicSqlSupport.name, NewsCategoryDynamicSqlSupport.sort, NewsCategoryDynamicSqlSupport.createUserId, NewsCategoryDynamicSqlSupport.createTime, NewsCategoryDynamicSqlSupport.updateUserId, NewsCategoryDynamicSqlSupport.updateTime)
                .from(NewsCategoryDynamicSqlSupport.newsCategory);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default NewsCategory selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, NewsCategoryDynamicSqlSupport.id, NewsCategoryDynamicSqlSupport.name, NewsCategoryDynamicSqlSupport.sort, NewsCategoryDynamicSqlSupport.createUserId, NewsCategoryDynamicSqlSupport.createTime, NewsCategoryDynamicSqlSupport.updateUserId, NewsCategoryDynamicSqlSupport.updateTime)
                .from(NewsCategoryDynamicSqlSupport.newsCategory)
                .where(NewsCategoryDynamicSqlSupport.id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(NewsCategory record) {
        return UpdateDSL.updateWithMapper(this::update, NewsCategoryDynamicSqlSupport.newsCategory)
                .set(NewsCategoryDynamicSqlSupport.id).equalTo(record::getId)
                .set(NewsCategoryDynamicSqlSupport.name).equalTo(record::getName)
                .set(NewsCategoryDynamicSqlSupport.sort).equalTo(record::getSort)
                .set(NewsCategoryDynamicSqlSupport.createUserId).equalTo(record::getCreateUserId)
                .set(NewsCategoryDynamicSqlSupport.createTime).equalTo(record::getCreateTime)
                .set(NewsCategoryDynamicSqlSupport.updateUserId).equalTo(record::getUpdateUserId)
                .set(NewsCategoryDynamicSqlSupport.updateTime).equalTo(record::getUpdateTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(NewsCategory record) {
        return UpdateDSL.updateWithMapper(this::update, NewsCategoryDynamicSqlSupport.newsCategory)
                .set(NewsCategoryDynamicSqlSupport.id).equalToWhenPresent(record::getId)
                .set(NewsCategoryDynamicSqlSupport.name).equalToWhenPresent(record::getName)
                .set(NewsCategoryDynamicSqlSupport.sort).equalToWhenPresent(record::getSort)
                .set(NewsCategoryDynamicSqlSupport.createUserId).equalToWhenPresent(record::getCreateUserId)
                .set(NewsCategoryDynamicSqlSupport.createTime).equalToWhenPresent(record::getCreateTime)
                .set(NewsCategoryDynamicSqlSupport.updateUserId).equalToWhenPresent(record::getUpdateUserId)
                .set(NewsCategoryDynamicSqlSupport.updateTime).equalToWhenPresent(record::getUpdateTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(NewsCategory record) {
        return UpdateDSL.updateWithMapper(this::update, NewsCategoryDynamicSqlSupport.newsCategory)
                .set(NewsCategoryDynamicSqlSupport.name).equalTo(record::getName)
                .set(NewsCategoryDynamicSqlSupport.sort).equalTo(record::getSort)
                .set(NewsCategoryDynamicSqlSupport.createUserId).equalTo(record::getCreateUserId)
                .set(NewsCategoryDynamicSqlSupport.createTime).equalTo(record::getCreateTime)
                .set(NewsCategoryDynamicSqlSupport.updateUserId).equalTo(record::getUpdateUserId)
                .set(NewsCategoryDynamicSqlSupport.updateTime).equalTo(record::getUpdateTime)
                .where(NewsCategoryDynamicSqlSupport.id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(NewsCategory record) {
        return UpdateDSL.updateWithMapper(this::update, NewsCategoryDynamicSqlSupport.newsCategory)
                .set(NewsCategoryDynamicSqlSupport.name).equalToWhenPresent(record::getName)
                .set(NewsCategoryDynamicSqlSupport.sort).equalToWhenPresent(record::getSort)
                .set(NewsCategoryDynamicSqlSupport.createUserId).equalToWhenPresent(record::getCreateUserId)
                .set(NewsCategoryDynamicSqlSupport.createTime).equalToWhenPresent(record::getCreateTime)
                .set(NewsCategoryDynamicSqlSupport.updateUserId).equalToWhenPresent(record::getUpdateUserId)
                .set(NewsCategoryDynamicSqlSupport.updateTime).equalToWhenPresent(record::getUpdateTime)
                .where(NewsCategoryDynamicSqlSupport.id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}