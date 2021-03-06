
/*
 * Copyright (C) 2012-2014 Typesafe Inc. <http://www.typesafe.com>
 */

package scala.runtime.function;

@FunctionalInterface
public interface JFunction2$mcZDJ$sp extends JFunction2<Object, Object, Object> {
    abstract boolean apply$mcZDJ$sp(double v1, long v2);

    default Object apply(Object v1, Object v2) { return (Boolean) apply$mcZDJ$sp(scala.runtime.BoxesRunTime.unboxToDouble(v1), scala.runtime.BoxesRunTime.unboxToLong(v2)); }
}
