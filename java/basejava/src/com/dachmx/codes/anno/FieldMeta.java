package com.dachmx.codes.anno;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
@Documented
public @interface FieldMeta{
	/**
	 *  is serial num
	 *  @return
	 */
	boolean id() default false;

	/**
	 * item name
	 * @return
	 */
	String name() default "";

	/**
	 * is can edit
	 */
	boolean editable() default true;

	/**
	 * is show in list
	 */
	boolean summary() default true;

	/**
	 * desc
	 */
	String description() default "";

	/**
	 * order
	 */
	int order() default 0;
}
