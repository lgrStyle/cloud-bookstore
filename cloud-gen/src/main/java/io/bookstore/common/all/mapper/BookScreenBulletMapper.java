package io.bookstore.common.all.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;

import io.bookstore.common.all.entity.BookScreenBullet;
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
public interface BookScreenBulletMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<BookScreenBullet> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("BookScreenBulletResult")
    BookScreenBullet selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="BookScreenBulletResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="content_id", property="contentId", jdbcType=JdbcType.BIGINT),
        @Result(column="screen_bullet", property="screenBullet", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<BookScreenBullet> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(BookScreenBulletDynamicSqlSupport.bookScreenBullet);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, BookScreenBulletDynamicSqlSupport.bookScreenBullet);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, BookScreenBulletDynamicSqlSupport.bookScreenBullet)
                .where(BookScreenBulletDynamicSqlSupport.id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(BookScreenBullet record) {
        return insert(SqlBuilder.insert(record)
                .into(BookScreenBulletDynamicSqlSupport.bookScreenBullet)
                .map(BookScreenBulletDynamicSqlSupport.id).toProperty("id")
                .map(BookScreenBulletDynamicSqlSupport.contentId).toProperty("contentId")
                .map(BookScreenBulletDynamicSqlSupport.screenBullet).toProperty("screenBullet")
                .map(BookScreenBulletDynamicSqlSupport.createTime).toProperty("createTime")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(BookScreenBullet record) {
        return insert(SqlBuilder.insert(record)
                .into(BookScreenBulletDynamicSqlSupport.bookScreenBullet)
                .map(BookScreenBulletDynamicSqlSupport.id).toPropertyWhenPresent("id", record::getId)
                .map(BookScreenBulletDynamicSqlSupport.contentId).toPropertyWhenPresent("contentId", record::getContentId)
                .map(BookScreenBulletDynamicSqlSupport.screenBullet).toPropertyWhenPresent("screenBullet", record::getScreenBullet)
                .map(BookScreenBulletDynamicSqlSupport.createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<BookScreenBullet>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, BookScreenBulletDynamicSqlSupport.id, BookScreenBulletDynamicSqlSupport.contentId, BookScreenBulletDynamicSqlSupport.screenBullet, BookScreenBulletDynamicSqlSupport.createTime)
                .from(BookScreenBulletDynamicSqlSupport.bookScreenBullet);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<BookScreenBullet>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, BookScreenBulletDynamicSqlSupport.id, BookScreenBulletDynamicSqlSupport.contentId, BookScreenBulletDynamicSqlSupport.screenBullet, BookScreenBulletDynamicSqlSupport.createTime)
                .from(BookScreenBulletDynamicSqlSupport.bookScreenBullet);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default BookScreenBullet selectByPrimaryKey(Long id_) {
        return SelectDSL.selectWithMapper(this::selectOne, BookScreenBulletDynamicSqlSupport.id, BookScreenBulletDynamicSqlSupport.contentId, BookScreenBulletDynamicSqlSupport.screenBullet, BookScreenBulletDynamicSqlSupport.createTime)
                .from(BookScreenBulletDynamicSqlSupport.bookScreenBullet)
                .where(BookScreenBulletDynamicSqlSupport.id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(BookScreenBullet record) {
        return UpdateDSL.updateWithMapper(this::update, BookScreenBulletDynamicSqlSupport.bookScreenBullet)
                .set(BookScreenBulletDynamicSqlSupport.id).equalTo(record::getId)
                .set(BookScreenBulletDynamicSqlSupport.contentId).equalTo(record::getContentId)
                .set(BookScreenBulletDynamicSqlSupport.screenBullet).equalTo(record::getScreenBullet)
                .set(BookScreenBulletDynamicSqlSupport.createTime).equalTo(record::getCreateTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(BookScreenBullet record) {
        return UpdateDSL.updateWithMapper(this::update, BookScreenBulletDynamicSqlSupport.bookScreenBullet)
                .set(BookScreenBulletDynamicSqlSupport.id).equalToWhenPresent(record::getId)
                .set(BookScreenBulletDynamicSqlSupport.contentId).equalToWhenPresent(record::getContentId)
                .set(BookScreenBulletDynamicSqlSupport.screenBullet).equalToWhenPresent(record::getScreenBullet)
                .set(BookScreenBulletDynamicSqlSupport.createTime).equalToWhenPresent(record::getCreateTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(BookScreenBullet record) {
        return UpdateDSL.updateWithMapper(this::update, BookScreenBulletDynamicSqlSupport.bookScreenBullet)
                .set(BookScreenBulletDynamicSqlSupport.contentId).equalTo(record::getContentId)
                .set(BookScreenBulletDynamicSqlSupport.screenBullet).equalTo(record::getScreenBullet)
                .set(BookScreenBulletDynamicSqlSupport.createTime).equalTo(record::getCreateTime)
                .where(BookScreenBulletDynamicSqlSupport.id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(BookScreenBullet record) {
        return UpdateDSL.updateWithMapper(this::update, BookScreenBulletDynamicSqlSupport.bookScreenBullet)
                .set(BookScreenBulletDynamicSqlSupport.contentId).equalToWhenPresent(record::getContentId)
                .set(BookScreenBulletDynamicSqlSupport.screenBullet).equalToWhenPresent(record::getScreenBullet)
                .set(BookScreenBulletDynamicSqlSupport.createTime).equalToWhenPresent(record::getCreateTime)
                .where(BookScreenBulletDynamicSqlSupport.id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}