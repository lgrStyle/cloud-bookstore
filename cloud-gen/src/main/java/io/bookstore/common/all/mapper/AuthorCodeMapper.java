package io.bookstore.common.all.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;

import io.bookstore.common.all.entity.AuthorCode;
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
public interface AuthorCodeMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<AuthorCode> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AuthorCodeResult")
    AuthorCode selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AuthorCodeResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="invite_code", property="inviteCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="validity_time", property="validityTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="is_use", property="isUse", jdbcType=JdbcType.TINYINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_user_id", property="createUserId", jdbcType=JdbcType.BIGINT)
    })
    List<AuthorCode> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(AuthorCodeDynamicSqlSupport.authorCode);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, AuthorCodeDynamicSqlSupport.authorCode);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, AuthorCodeDynamicSqlSupport.authorCode)
                .where(AuthorCodeDynamicSqlSupport.id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(AuthorCode record) {
        return insert(SqlBuilder.insert(record)
                .into(AuthorCodeDynamicSqlSupport.authorCode)
                .map(AuthorCodeDynamicSqlSupport.id).toProperty("id")
                .map(AuthorCodeDynamicSqlSupport.inviteCode).toProperty("inviteCode")
                .map(AuthorCodeDynamicSqlSupport.validityTime).toProperty("validityTime")
                .map(AuthorCodeDynamicSqlSupport.isUse).toProperty("isUse")
                .map(AuthorCodeDynamicSqlSupport.createTime).toProperty("createTime")
                .map(AuthorCodeDynamicSqlSupport.createUserId).toProperty("createUserId")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(AuthorCode record) {
        return insert(SqlBuilder.insert(record)
                .into(AuthorCodeDynamicSqlSupport.authorCode)
                .map(AuthorCodeDynamicSqlSupport.id).toPropertyWhenPresent("id", record::getId)
                .map(AuthorCodeDynamicSqlSupport.inviteCode).toPropertyWhenPresent("inviteCode", record::getInviteCode)
                .map(AuthorCodeDynamicSqlSupport.validityTime).toPropertyWhenPresent("validityTime", record::getValidityTime)
                .map(AuthorCodeDynamicSqlSupport.isUse).toPropertyWhenPresent("isUse", record::getIsUse)
                .map(AuthorCodeDynamicSqlSupport.createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(AuthorCodeDynamicSqlSupport.createUserId).toPropertyWhenPresent("createUserId", record::getCreateUserId)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AuthorCode>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, AuthorCodeDynamicSqlSupport.id, AuthorCodeDynamicSqlSupport.inviteCode, AuthorCodeDynamicSqlSupport.validityTime, AuthorCodeDynamicSqlSupport.isUse, AuthorCodeDynamicSqlSupport.createTime, AuthorCodeDynamicSqlSupport.createUserId)
                .from(AuthorCodeDynamicSqlSupport.authorCode);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AuthorCode>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, AuthorCodeDynamicSqlSupport.id, AuthorCodeDynamicSqlSupport.inviteCode, AuthorCodeDynamicSqlSupport.validityTime, AuthorCodeDynamicSqlSupport.isUse, AuthorCodeDynamicSqlSupport.createTime, AuthorCodeDynamicSqlSupport.createUserId)
                .from(AuthorCodeDynamicSqlSupport.authorCode);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default AuthorCode selectByPrimaryKey(Long id_) {
        return SelectDSL.selectWithMapper(this::selectOne, AuthorCodeDynamicSqlSupport.id, AuthorCodeDynamicSqlSupport.inviteCode, AuthorCodeDynamicSqlSupport.validityTime, AuthorCodeDynamicSqlSupport.isUse, AuthorCodeDynamicSqlSupport.createTime, AuthorCodeDynamicSqlSupport.createUserId)
                .from(AuthorCodeDynamicSqlSupport.authorCode)
                .where(AuthorCodeDynamicSqlSupport.id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(AuthorCode record) {
        return UpdateDSL.updateWithMapper(this::update, AuthorCodeDynamicSqlSupport.authorCode)
                .set(AuthorCodeDynamicSqlSupport.id).equalTo(record::getId)
                .set(AuthorCodeDynamicSqlSupport.inviteCode).equalTo(record::getInviteCode)
                .set(AuthorCodeDynamicSqlSupport.validityTime).equalTo(record::getValidityTime)
                .set(AuthorCodeDynamicSqlSupport.isUse).equalTo(record::getIsUse)
                .set(AuthorCodeDynamicSqlSupport.createTime).equalTo(record::getCreateTime)
                .set(AuthorCodeDynamicSqlSupport.createUserId).equalTo(record::getCreateUserId);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(AuthorCode record) {
        return UpdateDSL.updateWithMapper(this::update, AuthorCodeDynamicSqlSupport.authorCode)
                .set(AuthorCodeDynamicSqlSupport.id).equalToWhenPresent(record::getId)
                .set(AuthorCodeDynamicSqlSupport.inviteCode).equalToWhenPresent(record::getInviteCode)
                .set(AuthorCodeDynamicSqlSupport.validityTime).equalToWhenPresent(record::getValidityTime)
                .set(AuthorCodeDynamicSqlSupport.isUse).equalToWhenPresent(record::getIsUse)
                .set(AuthorCodeDynamicSqlSupport.createTime).equalToWhenPresent(record::getCreateTime)
                .set(AuthorCodeDynamicSqlSupport.createUserId).equalToWhenPresent(record::getCreateUserId);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(AuthorCode record) {
        return UpdateDSL.updateWithMapper(this::update, AuthorCodeDynamicSqlSupport.authorCode)
                .set(AuthorCodeDynamicSqlSupport.inviteCode).equalTo(record::getInviteCode)
                .set(AuthorCodeDynamicSqlSupport.validityTime).equalTo(record::getValidityTime)
                .set(AuthorCodeDynamicSqlSupport.isUse).equalTo(record::getIsUse)
                .set(AuthorCodeDynamicSqlSupport.createTime).equalTo(record::getCreateTime)
                .set(AuthorCodeDynamicSqlSupport.createUserId).equalTo(record::getCreateUserId)
                .where(AuthorCodeDynamicSqlSupport.id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(AuthorCode record) {
        return UpdateDSL.updateWithMapper(this::update, AuthorCodeDynamicSqlSupport.authorCode)
                .set(AuthorCodeDynamicSqlSupport.inviteCode).equalToWhenPresent(record::getInviteCode)
                .set(AuthorCodeDynamicSqlSupport.validityTime).equalToWhenPresent(record::getValidityTime)
                .set(AuthorCodeDynamicSqlSupport.isUse).equalToWhenPresent(record::getIsUse)
                .set(AuthorCodeDynamicSqlSupport.createTime).equalToWhenPresent(record::getCreateTime)
                .set(AuthorCodeDynamicSqlSupport.createUserId).equalToWhenPresent(record::getCreateUserId)
                .where(AuthorCodeDynamicSqlSupport.id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}