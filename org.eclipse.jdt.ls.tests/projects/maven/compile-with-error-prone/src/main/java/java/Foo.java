package java;

import org.apache.commons.lang3.StringUtils;

/**
 * This is foo
 */
public class Foo {

	public static void main(String[] args) {
	  new Exception();//error-prone compiler fails here, but not JDT
      System.out.print( StringUtils.capitalize("Hello world! from "+Foo.class));
	}
}
