package io.bookstore.common.all.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;

import io.bookstore.common.all.entity.News;
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
public interface NewsMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<News> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("NewsResult")
    News selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="NewsResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="cat_id", property="catId", jdbcType=JdbcType.INTEGER),
        @Result(column="cat_name", property="catName", jdbcType=JdbcType.VARCHAR),
        @Result(column="source_name", property="sourceName", jdbcType=JdbcType.VARCHAR),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_user_id", property="createUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_user_id", property="updateUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="content", property="content", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<News> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(NewsDynamicSqlSupport.news);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, NewsDynamicSqlSupport.news);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, NewsDynamicSqlSupport.news)
                .where(NewsDynamicSqlSupport.id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(News record) {
        return insert(SqlBuilder.insert(record)
                .into(NewsDynamicSqlSupport.news)
                .map(NewsDynamicSqlSupport.id).toProperty("id")
                .map(NewsDynamicSqlSupport.catId).toProperty("catId")
                .map(NewsDynamicSqlSupport.catName).toProperty("catName")
                .map(NewsDynamicSqlSupport.sourceName).toProperty("sourceName")
                .map(NewsDynamicSqlSupport.title).toProperty("title")
                .map(NewsDynamicSqlSupport.createTime).toProperty("createTime")
                .map(NewsDynamicSqlSupport.createUserId).toProperty("createUserId")
                .map(NewsDynamicSqlSupport.updateTime).toProperty("updateTime")
                .map(NewsDynamicSqlSupport.updateUserId).toProperty("updateUserId")
                .map(NewsDynamicSqlSupport.content).toProperty("content")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(News record) {
        return insert(SqlBuilder.insert(record)
                .into(NewsDynamicSqlSupport.news)
                .map(NewsDynamicSqlSupport.id).toPropertyWhenPresent("id", record::getId)
                .map(NewsDynamicSqlSupport.catId).toPropertyWhenPresent("catId", record::getCatId)
                .map(NewsDynamicSqlSupport.catName).toPropertyWhenPresent("catName", record::getCatName)
                .map(NewsDynamicSqlSupport.sourceName).toPropertyWhenPresent("sourceName", record::getSourceName)
                .map(NewsDynamicSqlSupport.title).toPropertyWhenPresent("title", record::getTitle)
                .map(NewsDynamicSqlSupport.createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(NewsDynamicSqlSupport.createUserId).toPropertyWhenPresent("createUserId", record::getCreateUserId)
                .map(NewsDynamicSqlSupport.updateTime).toPropertyWhenPresent("updateTime", record::getUpdateTime)
                .map(NewsDynamicSqlSupport.updateUserId).toPropertyWhenPresent("updateUserId", record::getUpdateUserId)
                .map(NewsDynamicSqlSupport.content).toPropertyWhenPresent("content", record::getContent)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<News>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, NewsDynamicSqlSupport.id, NewsDynamicSqlSupport.catId, NewsDynamicSqlSupport.catName, NewsDynamicSqlSupport.sourceName, NewsDynamicSqlSupport.title, NewsDynamicSqlSupport.createTime, NewsDynamicSqlSupport.createUserId, NewsDynamicSqlSupport.updateTime, NewsDynamicSqlSupport.updateUserId, NewsDynamicSqlSupport.content)
                .from(NewsDynamicSqlSupport.news);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<News>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, NewsDynamicSqlSupport.id, NewsDynamicSqlSupport.catId, NewsDynamicSqlSupport.catName, NewsDynamicSqlSupport.sourceName, NewsDynamicSqlSupport.title, NewsDynamicSqlSupport.createTime, NewsDynamicSqlSupport.createUserId, NewsDynamicSqlSupport.updateTime, NewsDynamicSqlSupport.updateUserId, NewsDynamicSqlSupport.content)
                .from(NewsDynamicSqlSupport.news);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default News selectByPrimaryKey(Long id_) {
        return SelectDSL.selectWithMapper(this::selectOne, NewsDynamicSqlSupport.id, NewsDynamicSqlSupport.catId, NewsDynamicSqlSupport.catName, NewsDynamicSqlSupport.sourceName, NewsDynamicSqlSupport.title, NewsDynamicSqlSupport.createTime, NewsDynamicSqlSupport.createUserId, NewsDynamicSqlSupport.updateTime, NewsDynamicSqlSupport.updateUserId, NewsDynamicSqlSupport.content)
                .from(NewsDynamicSqlSupport.news)
                .where(NewsDynamicSqlSupport.id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(News record) {
        return UpdateDSL.updateWithMapper(this::update, NewsDynamicSqlSupport.news)
                .set(NewsDynamicSqlSupport.id).equalTo(record::getId)
                .set(NewsDynamicSqlSupport.catId).equalTo(record::getCatId)
                .set(NewsDynamicSqlSupport.catName).equalTo(record::getCatName)
                .set(NewsDynamicSqlSupport.sourceName).equalTo(record::getSourceName)
                .set(NewsDynamicSqlSupport.title).equalTo(record::getTitle)
                .set(NewsDynamicSqlSupport.createTime).equalTo(record::getCreateTime)
                .set(NewsDynamicSqlSupport.createUserId).equalTo(record::getCreateUserId)
                .set(NewsDynamicSqlSupport.updateTime).equalTo(record::getUpdateTime)
                .set(NewsDynamicSqlSupport.updateUserId).equalTo(record::getUpdateUserId)
                .set(NewsDynamicSqlSupport.content).equalTo(record::getContent);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(News record) {
        return UpdateDSL.updateWithMapper(this::update, NewsDynamicSqlSupport.news)
                .set(NewsDynamicSqlSupport.id).equalToWhenPresent(record::getId)
                .set(NewsDynamicSqlSupport.catId).equalToWhenPresent(record::getCatId)
                .set(NewsDynamicSqlSupport.catName).equalToWhenPresent(record::getCatName)
                .set(NewsDynamicSqlSupport.sourceName).equalToWhenPresent(record::getSourceName)
                .set(NewsDynamicSqlSupport.title).equalToWhenPresent(record::getTitle)
                .set(NewsDynamicSqlSupport.createTime).equalToWhenPresent(record::getCreateTime)
                .set(NewsDynamicSqlSupport.createUserId).equalToWhenPresent(record::getCreateUserId)
                .set(NewsDynamicSqlSupport.updateTime).equalToWhenPresent(record::getUpdateTime)
                .set(NewsDynamicSqlSupport.updateUserId).equalToWhenPresent(record::getUpdateUserId)
                .set(NewsDynamicSqlSupport.content).equalToWhenPresent(record::getContent);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(News record) {
        return UpdateDSL.updateWithMapper(this::update, NewsDynamicSqlSupport.news)
                .set(NewsDynamicSqlSupport.catId).equalTo(record::getCatId)
                .set(NewsDynamicSqlSupport.catName).equalTo(record::getCatName)
                .set(NewsDynamicSqlSupport.sourceName).equalTo(record::getSourceName)
                .set(NewsDynamicSqlSupport.title).equalTo(record::getTitle)
                .set(NewsDynamicSqlSupport.createTime).equalTo(record::getCreateTime)
                .set(NewsDynamicSqlSupport.createUserId).equalTo(record::getCreateUserId)
                .set(NewsDynamicSqlSupport.updateTime).equalTo(record::getUpdateTime)
                .set(NewsDynamicSqlSupport.updateUserId).equalTo(record::getUpdateUserId)
                .set(NewsDynamicSqlSupport.content).equalTo(record::getContent)
                .where(NewsDynamicSqlSupport.id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(News record) {
        return UpdateDSL.updateWithMapper(this::update, NewsDynamicSqlSupport.news)
                .set(NewsDynamicSqlSupport.catId).equalToWhenPresent(record::getCatId)
                .set(NewsDynamicSqlSupport.catName).equalToWhenPresent(record::getCatName)
                .set(NewsDynamicSqlSupport.sourceName).equalToWhenPresent(record::getSourceName)
                .set(NewsDynamicSqlSupport.title).equalToWhenPresent(record::getTitle)
                .set(NewsDynamicSqlSupport.createTime).equalToWhenPresent(record::getCreateTime)
                .set(NewsDynamicSqlSupport.createUserId).equalToWhenPresent(record::getCreateUserId)
                .set(NewsDynamicSqlSupport.updateTime).equalToWhenPresent(record::getUpdateTime)
                .set(NewsDynamicSqlSupport.updateUserId).equalToWhenPresent(record::getUpdateUserId)
                .set(NewsDynamicSqlSupport.content).equalToWhenPresent(record::getContent)
                .where(NewsDynamicSqlSupport.id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}