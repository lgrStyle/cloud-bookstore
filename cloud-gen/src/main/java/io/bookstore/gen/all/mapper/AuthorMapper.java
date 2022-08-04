package io.bookstore.gen.all.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;

import io.bookstore.gen.all.entity.Author;
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
public interface AuthorMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Author> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AuthorResult")
    Author selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AuthorResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="invite_code", property="inviteCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="pen_name", property="penName", jdbcType=JdbcType.VARCHAR),
        @Result(column="tel_phone", property="telPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="chat_account", property="chatAccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="work_direction", property="workDirection", jdbcType=JdbcType.TINYINT),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Author> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(AuthorDynamicSqlSupport.author);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, AuthorDynamicSqlSupport.author);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, AuthorDynamicSqlSupport.author)
                .where(AuthorDynamicSqlSupport.id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Author record) {
        return insert(SqlBuilder.insert(record)
                .into(AuthorDynamicSqlSupport.author)
                .map(AuthorDynamicSqlSupport.id).toProperty("id")
                .map(AuthorDynamicSqlSupport.userId).toProperty("userId")
                .map(AuthorDynamicSqlSupport.inviteCode).toProperty("inviteCode")
                .map(AuthorDynamicSqlSupport.penName).toProperty("penName")
                .map(AuthorDynamicSqlSupport.telPhone).toProperty("telPhone")
                .map(AuthorDynamicSqlSupport.chatAccount).toProperty("chatAccount")
                .map(AuthorDynamicSqlSupport.email).toProperty("email")
                .map(AuthorDynamicSqlSupport.workDirection).toProperty("workDirection")
                .map(AuthorDynamicSqlSupport.status).toProperty("status")
                .map(AuthorDynamicSqlSupport.createTime).toProperty("createTime")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Author record) {
        return insert(SqlBuilder.insert(record)
                .into(AuthorDynamicSqlSupport.author)
                .map(AuthorDynamicSqlSupport.id).toPropertyWhenPresent("id", record::getId)
                .map(AuthorDynamicSqlSupport.userId).toPropertyWhenPresent("userId", record::getUserId)
                .map(AuthorDynamicSqlSupport.inviteCode).toPropertyWhenPresent("inviteCode", record::getInviteCode)
                .map(AuthorDynamicSqlSupport.penName).toPropertyWhenPresent("penName", record::getPenName)
                .map(AuthorDynamicSqlSupport.telPhone).toPropertyWhenPresent("telPhone", record::getTelPhone)
                .map(AuthorDynamicSqlSupport.chatAccount).toPropertyWhenPresent("chatAccount", record::getChatAccount)
                .map(AuthorDynamicSqlSupport.email).toPropertyWhenPresent("email", record::getEmail)
                .map(AuthorDynamicSqlSupport.workDirection).toPropertyWhenPresent("workDirection", record::getWorkDirection)
                .map(AuthorDynamicSqlSupport.status).toPropertyWhenPresent("status", record::getStatus)
                .map(AuthorDynamicSqlSupport.createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Author>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, AuthorDynamicSqlSupport.id, AuthorDynamicSqlSupport.userId, AuthorDynamicSqlSupport.inviteCode, AuthorDynamicSqlSupport.penName, AuthorDynamicSqlSupport.telPhone, AuthorDynamicSqlSupport.chatAccount, AuthorDynamicSqlSupport.email, AuthorDynamicSqlSupport.workDirection, AuthorDynamicSqlSupport.status, AuthorDynamicSqlSupport.createTime)
                .from(AuthorDynamicSqlSupport.author);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Author>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, AuthorDynamicSqlSupport.id, AuthorDynamicSqlSupport.userId, AuthorDynamicSqlSupport.inviteCode, AuthorDynamicSqlSupport.penName, AuthorDynamicSqlSupport.telPhone, AuthorDynamicSqlSupport.chatAccount, AuthorDynamicSqlSupport.email, AuthorDynamicSqlSupport.workDirection, AuthorDynamicSqlSupport.status, AuthorDynamicSqlSupport.createTime)
                .from(AuthorDynamicSqlSupport.author);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Author selectByPrimaryKey(Long id_) {
        return SelectDSL.selectWithMapper(this::selectOne, AuthorDynamicSqlSupport.id, AuthorDynamicSqlSupport.userId, AuthorDynamicSqlSupport.inviteCode, AuthorDynamicSqlSupport.penName, AuthorDynamicSqlSupport.telPhone, AuthorDynamicSqlSupport.chatAccount, AuthorDynamicSqlSupport.email, AuthorDynamicSqlSupport.workDirection, AuthorDynamicSqlSupport.status, AuthorDynamicSqlSupport.createTime)
                .from(AuthorDynamicSqlSupport.author)
                .where(AuthorDynamicSqlSupport.id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Author record) {
        return UpdateDSL.updateWithMapper(this::update, AuthorDynamicSqlSupport.author)
                .set(AuthorDynamicSqlSupport.id).equalTo(record::getId)
                .set(AuthorDynamicSqlSupport.userId).equalTo(record::getUserId)
                .set(AuthorDynamicSqlSupport.inviteCode).equalTo(record::getInviteCode)
                .set(AuthorDynamicSqlSupport.penName).equalTo(record::getPenName)
                .set(AuthorDynamicSqlSupport.telPhone).equalTo(record::getTelPhone)
                .set(AuthorDynamicSqlSupport.chatAccount).equalTo(record::getChatAccount)
                .set(AuthorDynamicSqlSupport.email).equalTo(record::getEmail)
                .set(AuthorDynamicSqlSupport.workDirection).equalTo(record::getWorkDirection)
                .set(AuthorDynamicSqlSupport.status).equalTo(record::getStatus)
                .set(AuthorDynamicSqlSupport.createTime).equalTo(record::getCreateTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Author record) {
        return UpdateDSL.updateWithMapper(this::update, AuthorDynamicSqlSupport.author)
                .set(AuthorDynamicSqlSupport.id).equalToWhenPresent(record::getId)
                .set(AuthorDynamicSqlSupport.userId).equalToWhenPresent(record::getUserId)
                .set(AuthorDynamicSqlSupport.inviteCode).equalToWhenPresent(record::getInviteCode)
                .set(AuthorDynamicSqlSupport.penName).equalToWhenPresent(record::getPenName)
                .set(AuthorDynamicSqlSupport.telPhone).equalToWhenPresent(record::getTelPhone)
                .set(AuthorDynamicSqlSupport.chatAccount).equalToWhenPresent(record::getChatAccount)
                .set(AuthorDynamicSqlSupport.email).equalToWhenPresent(record::getEmail)
                .set(AuthorDynamicSqlSupport.workDirection).equalToWhenPresent(record::getWorkDirection)
                .set(AuthorDynamicSqlSupport.status).equalToWhenPresent(record::getStatus)
                .set(AuthorDynamicSqlSupport.createTime).equalToWhenPresent(record::getCreateTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Author record) {
        return UpdateDSL.updateWithMapper(this::update, AuthorDynamicSqlSupport.author)
                .set(AuthorDynamicSqlSupport.userId).equalTo(record::getUserId)
                .set(AuthorDynamicSqlSupport.inviteCode).equalTo(record::getInviteCode)
                .set(AuthorDynamicSqlSupport.penName).equalTo(record::getPenName)
                .set(AuthorDynamicSqlSupport.telPhone).equalTo(record::getTelPhone)
                .set(AuthorDynamicSqlSupport.chatAccount).equalTo(record::getChatAccount)
                .set(AuthorDynamicSqlSupport.email).equalTo(record::getEmail)
                .set(AuthorDynamicSqlSupport.workDirection).equalTo(record::getWorkDirection)
                .set(AuthorDynamicSqlSupport.status).equalTo(record::getStatus)
                .set(AuthorDynamicSqlSupport.createTime).equalTo(record::getCreateTime)
                .where(AuthorDynamicSqlSupport.id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Author record) {
        return UpdateDSL.updateWithMapper(this::update, AuthorDynamicSqlSupport.author)
                .set(AuthorDynamicSqlSupport.userId).equalToWhenPresent(record::getUserId)
                .set(AuthorDynamicSqlSupport.inviteCode).equalToWhenPresent(record::getInviteCode)
                .set(AuthorDynamicSqlSupport.penName).equalToWhenPresent(record::getPenName)
                .set(AuthorDynamicSqlSupport.telPhone).equalToWhenPresent(record::getTelPhone)
                .set(AuthorDynamicSqlSupport.chatAccount).equalToWhenPresent(record::getChatAccount)
                .set(AuthorDynamicSqlSupport.email).equalToWhenPresent(record::getEmail)
                .set(AuthorDynamicSqlSupport.workDirection).equalToWhenPresent(record::getWorkDirection)
                .set(AuthorDynamicSqlSupport.status).equalToWhenPresent(record::getStatus)
                .set(AuthorDynamicSqlSupport.createTime).equalToWhenPresent(record::getCreateTime)
                .where(AuthorDynamicSqlSupport.id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}