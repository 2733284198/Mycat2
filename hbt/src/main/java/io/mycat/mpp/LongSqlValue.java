package io.mycat.mpp;

import com.alibaba.fastsql.sql.ast.SQLObject;
import com.alibaba.fastsql.sql.ast.expr.SQLExprUtils;
import io.mycat.mpp.plan.DataAccessor;
import io.mycat.mpp.plan.RowType;
import io.mycat.mpp.runtime.Type;

public class LongSqlValue implements SqlValue {
    final long value;

    public LongSqlValue(long value) {
        this.value = value;
    }

    public static LongSqlValue create(long value) {
        return new LongSqlValue(value);
    }

    @Override
    public Object getValue(io.mycat.mpp.plan.RowType type, DataAccessor dataAccessor, DataContext context) {
        return value;
    }

    @Override
    public boolean getValueAsBoolean(RowType columns, DataAccessor dataAccessor, DataContext dataContext) {
        return value > 0;
    }

    @Override
    public Type getType() {
        return Type.of(Type.INT, false);
    }

    @Override
    public SQLObject toParseTree() {
        return SQLExprUtils.fromJavaObject(value);
    }
}