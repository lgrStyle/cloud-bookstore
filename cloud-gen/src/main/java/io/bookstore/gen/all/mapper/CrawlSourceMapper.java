package io.bookstore.gen.all.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;

import io.bookstore.gen.all.entity.CrawlSource;
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
public interface CrawlSourceMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<CrawlSource> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CrawlSourceResult")
    CrawlSource selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CrawlSourceResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="source_name", property="sourceName", jdbcType=JdbcType.VARCHAR),
        @Result(column="source_status", property="sourceStatus", jdbcType=JdbcType.TINYINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="crawl_rule", property="crawlRule", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<CrawlSource> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(CrawlSourceDynamicSqlSupport.crawlSource);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, CrawlSourceDynamicSqlSupport.crawlSource);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, CrawlSourceDynamicSqlSupport.crawlSource)
                .where(CrawlSourceDynamicSqlSupport.id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(CrawlSource record) {
        return insert(SqlBuilder.insert(record)
                .into(CrawlSourceDynamicSqlSupport.crawlSource)
                .map(CrawlSourceDynamicSqlSupport.id).toProperty("id")
                .map(CrawlSourceDynamicSqlSupport.sourceName).toProperty("sourceName")
                .map(CrawlSourceDynamicSqlSupport.sourceStatus).toProperty("sourceStatus")
                .map(CrawlSourceDynamicSqlSupport.createTime).toProperty("createTime")
                .map(CrawlSourceDynamicSqlSupport.updateTime).toProperty("updateTime")
                .map(CrawlSourceDynamicSqlSupport.crawlRule).toProperty("crawlRule")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(CrawlSource record) {
        return insert(SqlBuilder.insert(record)
                .into(CrawlSourceDynamicSqlSupport.crawlSource)
                .map(CrawlSourceDynamicSqlSupport.id).toPropertyWhenPresent("id", record::getId)
                .map(CrawlSourceDynamicSqlSupport.sourceName).toPropertyWhenPresent("sourceName", record::getSourceName)
                .map(CrawlSourceDynamicSqlSupport.sourceStatus).toPropertyWhenPresent("sourceStatus", record::getSourceStatus)
                .map(CrawlSourceDynamicSqlSupport.createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(CrawlSourceDynamicSqlSupport.updateTime).toPropertyWhenPresent("updateTime", record::getUpdateTime)
                .map(CrawlSourceDynamicSqlSupport.crawlRule).toPropertyWhenPresent("crawlRule", record::getCrawlRule)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<CrawlSource>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, CrawlSourceDynamicSqlSupport.id, CrawlSourceDynamicSqlSupport.sourceName, CrawlSourceDynamicSqlSupport.sourceStatus, CrawlSourceDynamicSqlSupport.createTime, CrawlSourceDynamicSqlSupport.updateTime, CrawlSourceDynamicSqlSupport.crawlRule)
                .from(CrawlSourceDynamicSqlSupport.crawlSource);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<CrawlSource>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, CrawlSourceDynamicSqlSupport.id, CrawlSourceDynamicSqlSupport.sourceName, CrawlSourceDynamicSqlSupport.sourceStatus, CrawlSourceDynamicSqlSupport.createTime, CrawlSourceDynamicSqlSupport.updateTime, CrawlSourceDynamicSqlSupport.crawlRule)
                .from(CrawlSourceDynamicSqlSupport.crawlSource);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default CrawlSource selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, CrawlSourceDynamicSqlSupport.id, CrawlSourceDynamicSqlSupport.sourceName, CrawlSourceDynamicSqlSupport.sourceStatus, CrawlSourceDynamicSqlSupport.createTime, CrawlSourceDynamicSqlSupport.updateTime, CrawlSourceDynamicSqlSupport.crawlRule)
                .from(CrawlSourceDynamicSqlSupport.crawlSource)
                .where(CrawlSourceDynamicSqlSupport.id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(CrawlSource record) {
        return UpdateDSL.updateWithMapper(this::update, CrawlSourceDynamicSqlSupport.crawlSource)
                .set(CrawlSourceDynamicSqlSupport.id).equalTo(record::getId)
                .set(CrawlSourceDynamicSqlSupport.sourceName).equalTo(record::getSourceName)
                .set(CrawlSourceDynamicSqlSupport.sourceStatus).equalTo(record::getSourceStatus)
                .set(CrawlSourceDynamicSqlSupport.createTime).equalTo(record::getCreateTime)
                .set(CrawlSourceDynamicSqlSupport.updateTime).equalTo(record::getUpdateTime)
                .set(CrawlSourceDynamicSqlSupport.crawlRule).equalTo(record::getCrawlRule);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(CrawlSource record) {
        return UpdateDSL.updateWithMapper(this::update, CrawlSourceDynamicSqlSupport.crawlSource)
                .set(CrawlSourceDynamicSqlSupport.id).equalToWhenPresent(record::getId)
                .set(CrawlSourceDynamicSqlSupport.sourceName).equalToWhenPresent(record::getSourceName)
                .set(CrawlSourceDynamicSqlSupport.sourceStatus).equalToWhenPresent(record::getSourceStatus)
                .set(CrawlSourceDynamicSqlSupport.createTime).equalToWhenPresent(record::getCreateTime)
                .set(CrawlSourceDynamicSqlSupport.updateTime).equalToWhenPresent(record::getUpdateTime)
                .set(CrawlSourceDynamicSqlSupport.crawlRule).equalToWhenPresent(record::getCrawlRule);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(CrawlSource record) {
        return UpdateDSL.updateWithMapper(this::update, CrawlSourceDynamicSqlSupport.crawlSource)
                .set(CrawlSourceDynamicSqlSupport.sourceName).equalTo(record::getSourceName)
                .set(CrawlSourceDynamicSqlSupport.sourceStatus).equalTo(record::getSourceStatus)
                .set(CrawlSourceDynamicSqlSupport.createTime).equalTo(record::getCreateTime)
                .set(CrawlSourceDynamicSqlSupport.updateTime).equalTo(record::getUpdateTime)
                .set(CrawlSourceDynamicSqlSupport.crawlRule).equalTo(record::getCrawlRule)
                .where(CrawlSourceDynamicSqlSupport.id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(CrawlSource record) {
        return UpdateDSL.updateWithMapper(this::update, CrawlSourceDynamicSqlSupport.crawlSource)
                .set(CrawlSourceDynamicSqlSupport.sourceName).equalToWhenPresent(record::getSourceName)
                .set(CrawlSourceDynamicSqlSupport.sourceStatus).equalToWhenPresent(record::getSourceStatus)
                .set(CrawlSourceDynamicSqlSupport.createTime).equalToWhenPresent(record::getCreateTime)
                .set(CrawlSourceDynamicSqlSupport.updateTime).equalToWhenPresent(record::getUpdateTime)
                .set(CrawlSourceDynamicSqlSupport.crawlRule).equalToWhenPresent(record::getCrawlRule)
                .where(CrawlSourceDynamicSqlSupport.id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}