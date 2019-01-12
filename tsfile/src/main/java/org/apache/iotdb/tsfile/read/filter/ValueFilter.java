package org.apache.iotdb.tsfile.read.filter;

import org.apache.iotdb.tsfile.read.filter.basic.Filter;
import org.apache.iotdb.tsfile.read.filter.factory.FilterType;
import org.apache.iotdb.tsfile.read.filter.operator.*;
import org.apache.iotdb.tsfile.read.filter.basic.Filter;
import org.apache.iotdb.tsfile.read.filter.factory.FilterType;
import org.apache.iotdb.tsfile.read.filter.operator.*;


public class ValueFilter {

    public static class ValueEq<T extends Comparable<T>> extends Eq<T> {
        private ValueEq(T value) {
            super(value, FilterType.VALUE_FILTER);
        }
    }

    public static class ValueGt<T extends Comparable<T>> extends Gt<T> {
        private ValueGt(T value) {
            super(value, FilterType.VALUE_FILTER);
        }
    }

    public static class ValueGtEq<T extends Comparable<T>> extends GtEq<T> {
        private ValueGtEq(T value) {
            super(value, FilterType.VALUE_FILTER);
        }
    }

    public static class ValueLt<T extends Comparable<T>> extends Lt<T> {
        private ValueLt(T value) {
            super(value, FilterType.VALUE_FILTER);
        }
    }

    public static class ValueLtEq<T extends Comparable<T>> extends LtEq<T> {
        private ValueLtEq(T value) {
            super(value, FilterType.VALUE_FILTER);
        }
    }

    public static class ValueNotFilter extends NotFilter {
        private ValueNotFilter(Filter filter) {
            super(filter);
        }

        @Override
        public String toString() {
            return FilterType.VALUE_FILTER + super.toString();
        }
    }

    public static class ValueNotEq<T extends Comparable<T>> extends NotEq<T> {
        private ValueNotEq(T value) {
            super(value, FilterType.VALUE_FILTER);
        }
    }

    public static <T extends Comparable<T>> ValueEq<T> eq(T value) {
        return new ValueEq(value);
    }

    public static <T extends Comparable<T>> ValueGt<T> gt(T value) {
        return new ValueGt(value);
    }

    public static <T extends Comparable<T>> ValueGtEq<T> gtEq(T value) {
        return new ValueGtEq(value);
    }

    public static <T extends Comparable<T>> ValueLt<T> lt(T value) {
        return new ValueLt(value);
    }

    public static <T extends Comparable<T>> ValueLtEq<T> ltEq(T value) {
        return new ValueLtEq(value);
    }

    public static ValueNotFilter not(Filter filter) {
        return new ValueNotFilter(filter);
    }

    public static <T extends Comparable<T>> ValueNotEq<T> notEq(T value) {
        return new ValueNotEq(value);
    }
}