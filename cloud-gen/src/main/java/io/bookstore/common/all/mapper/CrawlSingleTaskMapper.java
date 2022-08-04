package io.bookstore.common.all.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;

import io.bookstore.common.all.entity.CrawlSingleTask;
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
public interface CrawlSingleTaskMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<CrawlSingleTask> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CrawlSingleTaskResult")
    CrawlSingleTask selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CrawlSingleTaskResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="source_id", property="sourceId", jdbcType=JdbcType.INTEGER),
        @Result(column="source_book_id", property="sourceBookId", jdbcType=JdbcType.VARCHAR),
        @Result(column="task_status", property="taskStatus", jdbcType=JdbcType.TINYINT),
        @Result(column="exc_count", property="excCount", jdbcType=JdbcType.TINYINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<CrawlSingleTask> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(CrawlSingleTaskDynamicSqlSupport.crawlSingleTask);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, CrawlSingleTaskDynamicSqlSupport.crawlSingleTask);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, CrawlSingleTaskDynamicSqlSupport.crawlSingleTask)
                .where(CrawlSingleTaskDynamicSqlSupport.id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(CrawlSingleTask record) {
        return insert(SqlBuilder.insert(record)
                .into(CrawlSingleTaskDynamicSqlSupport.crawlSingleTask)
                .map(CrawlSingleTaskDynamicSqlSupport.id).toProperty("id")
                .map(CrawlSingleTaskDynamicSqlSupport.sourceId).toProperty("sourceId")
                .map(CrawlSingleTaskDynamicSqlSupport.sourceBookId).toProperty("sourceBookId")
                .map(CrawlSingleTaskDynamicSqlSupport.taskStatus).toProperty("taskStatus")
                .map(CrawlSingleTaskDynamicSqlSupport.excCount).toProperty("excCount")
                .map(CrawlSingleTaskDynamicSqlSupport.createTime).toProperty("createTime")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(CrawlSingleTask record) {
        return insert(SqlBuilder.insert(record)
                .into(CrawlSingleTaskDynamicSqlSupport.crawlSingleTask)
                .map(CrawlSingleTaskDynamicSqlSupport.id).toPropertyWhenPresent("id", record::getId)
                .map(CrawlSingleTaskDynamicSqlSupport.sourceId).toPropertyWhenPresent("sourceId", record::getSourceId)
                .map(CrawlSingleTaskDynamicSqlSupport.sourceBookId).toPropertyWhenPresent("sourceBookId", record::getSourceBookId)
                .map(CrawlSingleTaskDynamicSqlSupport.taskStatus).toPropertyWhenPresent("taskStatus", record::getTaskStatus)
                .map(CrawlSingleTaskDynamicSqlSupport.excCount).toPropertyWhenPresent("excCount", record::getExcCount)
                .map(CrawlSingleTaskDynamicSqlSupport.createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<CrawlSingleTask>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, CrawlSingleTaskDynamicSqlSupport.id, CrawlSingleTaskDynamicSqlSupport.sourceId, CrawlSingleTaskDynamicSqlSupport.sourceBookId, CrawlSingleTaskDynamicSqlSupport.taskStatus, CrawlSingleTaskDynamicSqlSupport.excCount, CrawlSingleTaskDynamicSqlSupport.createTime)
                .from(CrawlSingleTaskDynamicSqlSupport.crawlSingleTask);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<CrawlSingleTask>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, CrawlSingleTaskDynamicSqlSupport.id, CrawlSingleTaskDynamicSqlSupport.sourceId, CrawlSingleTaskDynamicSqlSupport.sourceBookId, CrawlSingleTaskDynamicSqlSupport.taskStatus, CrawlSingleTaskDynamicSqlSupport.excCount, CrawlSingleTaskDynamicSqlSupport.createTime)
                .from(CrawlSingleTaskDynamicSqlSupport.crawlSingleTask);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default CrawlSingleTask selectByPrimaryKey(Long id_) {
        return SelectDSL.selectWithMapper(this::selectOne, CrawlSingleTaskDynamicSqlSupport.id, CrawlSingleTaskDynamicSqlSupport.sourceId, CrawlSingleTaskDynamicSqlSupport.sourceBookId, CrawlSingleTaskDynamicSqlSupport.taskStatus, CrawlSingleTaskDynamicSqlSupport.excCount, CrawlSingleTaskDynamicSqlSupport.createTime)
                .from(CrawlSingleTaskDynamicSqlSupport.crawlSingleTask)
                .where(CrawlSingleTaskDynamicSqlSupport.id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(CrawlSingleTask record) {
        return UpdateDSL.updateWithMapper(this::update, CrawlSingleTaskDynamicSqlSupport.crawlSingleTask)
                .set(CrawlSingleTaskDynamicSqlSupport.id).equalTo(record::getId)
                .set(CrawlSingleTaskDynamicSqlSupport.sourceId).equalTo(record::getSourceId)
                .set(CrawlSingleTaskDynamicSqlSupport.sourceBookId).equalTo(record::getSourceBookId)
                .set(CrawlSingleTaskDynamicSqlSupport.taskStatus).equalTo(record::getTaskStatus)
                .set(CrawlSingleTaskDynamicSqlSupport.excCount).equalTo(record::getExcCount)
                .set(CrawlSingleTaskDynamicSqlSupport.createTime).equalTo(record::getCreateTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(CrawlSingleTask record) {
        return UpdateDSL.updateWithMapper(this::update, CrawlSingleTaskDynamicSqlSupport.crawlSingleTask)
                .set(CrawlSingleTaskDynamicSqlSupport.id).equalToWhenPresent(record::getId)
                .set(CrawlSingleTaskDynamicSqlSupport.sourceId).equalToWhenPresent(record::getSourceId)
                .set(CrawlSingleTaskDynamicSqlSupport.sourceBookId).equalToWhenPresent(record::getSourceBookId)
                .set(CrawlSingleTaskDynamicSqlSupport.taskStatus).equalToWhenPresent(record::getTaskStatus)
                .set(CrawlSingleTaskDynamicSqlSupport.excCount).equalToWhenPresent(record::getExcCount)
                .set(CrawlSingleTaskDynamicSqlSupport.createTime).equalToWhenPresent(record::getCreateTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(CrawlSingleTask record) {
        return UpdateDSL.updateWithMapper(this::update, CrawlSingleTaskDynamicSqlSupport.crawlSingleTask)
                .set(CrawlSingleTaskDynamicSqlSupport.sourceId).equalTo(record::getSourceId)
                .set(CrawlSingleTaskDynamicSqlSupport.sourceBookId).equalTo(record::getSourceBookId)
                .set(CrawlSingleTaskDynamicSqlSupport.taskStatus).equalTo(record::getTaskStatus)
                .set(CrawlSingleTaskDynamicSqlSupport.excCount).equalTo(record::getExcCount)
                .set(CrawlSingleTaskDynamicSqlSupport.createTime).equalTo(record::getCreateTime)
                .where(CrawlSingleTaskDynamicSqlSupport.id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(CrawlSingleTask record) {
        return UpdateDSL.updateWithMapper(this::update, CrawlSingleTaskDynamicSqlSupport.crawlSingleTask)
                .set(CrawlSingleTaskDynamicSqlSupport.sourceId).equalToWhenPresent(record::getSourceId)
                .set(CrawlSingleTaskDynamicSqlSupport.sourceBookId).equalToWhenPresent(record::getSourceBookId)
                .set(CrawlSingleTaskDynamicSqlSupport.taskStatus).equalToWhenPresent(record::getTaskStatus)
                .set(CrawlSingleTaskDynamicSqlSupport.excCount).equalToWhenPresent(record::getExcCount)
                .set(CrawlSingleTaskDynamicSqlSupport.createTime).equalToWhenPresent(record::getCreateTime)
                .where(CrawlSingleTaskDynamicSqlSupport.id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}