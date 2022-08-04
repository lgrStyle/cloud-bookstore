package io.bookstore.common.all.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;

import io.bookstore.common.all.entity.CrawlBatchTask;
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
public interface CrawlBatchTaskMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<CrawlBatchTask> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CrawlBatchTaskResult")
    CrawlBatchTask selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CrawlBatchTaskResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="source_id", property="sourceId", jdbcType=JdbcType.INTEGER),
        @Result(column="crawl_count_success", property="crawlCountSuccess", jdbcType=JdbcType.INTEGER),
        @Result(column="crawl_count_target", property="crawlCountTarget", jdbcType=JdbcType.INTEGER),
        @Result(column="task_status", property="taskStatus", jdbcType=JdbcType.TINYINT),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<CrawlBatchTask> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(CrawlBatchTaskDynamicSqlSupport.crawlBatchTask);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, CrawlBatchTaskDynamicSqlSupport.crawlBatchTask);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, CrawlBatchTaskDynamicSqlSupport.crawlBatchTask)
                .where(CrawlBatchTaskDynamicSqlSupport.id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(CrawlBatchTask record) {
        return insert(SqlBuilder.insert(record)
                .into(CrawlBatchTaskDynamicSqlSupport.crawlBatchTask)
                .map(CrawlBatchTaskDynamicSqlSupport.id).toProperty("id")
                .map(CrawlBatchTaskDynamicSqlSupport.sourceId).toProperty("sourceId")
                .map(CrawlBatchTaskDynamicSqlSupport.crawlCountSuccess).toProperty("crawlCountSuccess")
                .map(CrawlBatchTaskDynamicSqlSupport.crawlCountTarget).toProperty("crawlCountTarget")
                .map(CrawlBatchTaskDynamicSqlSupport.taskStatus).toProperty("taskStatus")
                .map(CrawlBatchTaskDynamicSqlSupport.startTime).toProperty("startTime")
                .map(CrawlBatchTaskDynamicSqlSupport.endTime).toProperty("endTime")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(CrawlBatchTask record) {
        return insert(SqlBuilder.insert(record)
                .into(CrawlBatchTaskDynamicSqlSupport.crawlBatchTask)
                .map(CrawlBatchTaskDynamicSqlSupport.id).toPropertyWhenPresent("id", record::getId)
                .map(CrawlBatchTaskDynamicSqlSupport.sourceId).toPropertyWhenPresent("sourceId", record::getSourceId)
                .map(CrawlBatchTaskDynamicSqlSupport.crawlCountSuccess).toPropertyWhenPresent("crawlCountSuccess", record::getCrawlCountSuccess)
                .map(CrawlBatchTaskDynamicSqlSupport.crawlCountTarget).toPropertyWhenPresent("crawlCountTarget", record::getCrawlCountTarget)
                .map(CrawlBatchTaskDynamicSqlSupport.taskStatus).toPropertyWhenPresent("taskStatus", record::getTaskStatus)
                .map(CrawlBatchTaskDynamicSqlSupport.startTime).toPropertyWhenPresent("startTime", record::getStartTime)
                .map(CrawlBatchTaskDynamicSqlSupport.endTime).toPropertyWhenPresent("endTime", record::getEndTime)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<CrawlBatchTask>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, CrawlBatchTaskDynamicSqlSupport.id, CrawlBatchTaskDynamicSqlSupport.sourceId, CrawlBatchTaskDynamicSqlSupport.crawlCountSuccess, CrawlBatchTaskDynamicSqlSupport.crawlCountTarget, CrawlBatchTaskDynamicSqlSupport.taskStatus, CrawlBatchTaskDynamicSqlSupport.startTime, CrawlBatchTaskDynamicSqlSupport.endTime)
                .from(CrawlBatchTaskDynamicSqlSupport.crawlBatchTask);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<CrawlBatchTask>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, CrawlBatchTaskDynamicSqlSupport.id, CrawlBatchTaskDynamicSqlSupport.sourceId, CrawlBatchTaskDynamicSqlSupport.crawlCountSuccess, CrawlBatchTaskDynamicSqlSupport.crawlCountTarget, CrawlBatchTaskDynamicSqlSupport.taskStatus, CrawlBatchTaskDynamicSqlSupport.startTime, CrawlBatchTaskDynamicSqlSupport.endTime)
                .from(CrawlBatchTaskDynamicSqlSupport.crawlBatchTask);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default CrawlBatchTask selectByPrimaryKey(Long id_) {
        return SelectDSL.selectWithMapper(this::selectOne, CrawlBatchTaskDynamicSqlSupport.id, CrawlBatchTaskDynamicSqlSupport.sourceId, CrawlBatchTaskDynamicSqlSupport.crawlCountSuccess, CrawlBatchTaskDynamicSqlSupport.crawlCountTarget, CrawlBatchTaskDynamicSqlSupport.taskStatus, CrawlBatchTaskDynamicSqlSupport.startTime, CrawlBatchTaskDynamicSqlSupport.endTime)
                .from(CrawlBatchTaskDynamicSqlSupport.crawlBatchTask)
                .where(CrawlBatchTaskDynamicSqlSupport.id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(CrawlBatchTask record) {
        return UpdateDSL.updateWithMapper(this::update, CrawlBatchTaskDynamicSqlSupport.crawlBatchTask)
                .set(CrawlBatchTaskDynamicSqlSupport.id).equalTo(record::getId)
                .set(CrawlBatchTaskDynamicSqlSupport.sourceId).equalTo(record::getSourceId)
                .set(CrawlBatchTaskDynamicSqlSupport.crawlCountSuccess).equalTo(record::getCrawlCountSuccess)
                .set(CrawlBatchTaskDynamicSqlSupport.crawlCountTarget).equalTo(record::getCrawlCountTarget)
                .set(CrawlBatchTaskDynamicSqlSupport.taskStatus).equalTo(record::getTaskStatus)
                .set(CrawlBatchTaskDynamicSqlSupport.startTime).equalTo(record::getStartTime)
                .set(CrawlBatchTaskDynamicSqlSupport.endTime).equalTo(record::getEndTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(CrawlBatchTask record) {
        return UpdateDSL.updateWithMapper(this::update, CrawlBatchTaskDynamicSqlSupport.crawlBatchTask)
                .set(CrawlBatchTaskDynamicSqlSupport.id).equalToWhenPresent(record::getId)
                .set(CrawlBatchTaskDynamicSqlSupport.sourceId).equalToWhenPresent(record::getSourceId)
                .set(CrawlBatchTaskDynamicSqlSupport.crawlCountSuccess).equalToWhenPresent(record::getCrawlCountSuccess)
                .set(CrawlBatchTaskDynamicSqlSupport.crawlCountTarget).equalToWhenPresent(record::getCrawlCountTarget)
                .set(CrawlBatchTaskDynamicSqlSupport.taskStatus).equalToWhenPresent(record::getTaskStatus)
                .set(CrawlBatchTaskDynamicSqlSupport.startTime).equalToWhenPresent(record::getStartTime)
                .set(CrawlBatchTaskDynamicSqlSupport.endTime).equalToWhenPresent(record::getEndTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(CrawlBatchTask record) {
        return UpdateDSL.updateWithMapper(this::update, CrawlBatchTaskDynamicSqlSupport.crawlBatchTask)
                .set(CrawlBatchTaskDynamicSqlSupport.sourceId).equalTo(record::getSourceId)
                .set(CrawlBatchTaskDynamicSqlSupport.crawlCountSuccess).equalTo(record::getCrawlCountSuccess)
                .set(CrawlBatchTaskDynamicSqlSupport.crawlCountTarget).equalTo(record::getCrawlCountTarget)
                .set(CrawlBatchTaskDynamicSqlSupport.taskStatus).equalTo(record::getTaskStatus)
                .set(CrawlBatchTaskDynamicSqlSupport.startTime).equalTo(record::getStartTime)
                .set(CrawlBatchTaskDynamicSqlSupport.endTime).equalTo(record::getEndTime)
                .where(CrawlBatchTaskDynamicSqlSupport.id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(CrawlBatchTask record) {
        return UpdateDSL.updateWithMapper(this::update, CrawlBatchTaskDynamicSqlSupport.crawlBatchTask)
                .set(CrawlBatchTaskDynamicSqlSupport.sourceId).equalToWhenPresent(record::getSourceId)
                .set(CrawlBatchTaskDynamicSqlSupport.crawlCountSuccess).equalToWhenPresent(record::getCrawlCountSuccess)
                .set(CrawlBatchTaskDynamicSqlSupport.crawlCountTarget).equalToWhenPresent(record::getCrawlCountTarget)
                .set(CrawlBatchTaskDynamicSqlSupport.taskStatus).equalToWhenPresent(record::getTaskStatus)
                .set(CrawlBatchTaskDynamicSqlSupport.startTime).equalToWhenPresent(record::getStartTime)
                .set(CrawlBatchTaskDynamicSqlSupport.endTime).equalToWhenPresent(record::getEndTime)
                .where(CrawlBatchTaskDynamicSqlSupport.id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}