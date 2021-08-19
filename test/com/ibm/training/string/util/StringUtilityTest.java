package com.ibm.training.string.util;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

public class StringUtilityTest {
	
	
	
	/*
	 * @ParameterizedTest
	 * 
	 * @ValueSource(strings= {""," "}) public void
	 * test_isBlank_returnsTrueIfStringIsBlank(String str) {
	 * assertTrue(StringUtils.isBlank(str)); }
	 */
	
	/*
	 * @ParameterizedTest
	 * 
	 * @NullSource public void
	 * test_isBlank_returnsTrueIfStringIsBlank_NullSource(String str) {
	 * assertTrue(StringUtils.isBlank(str)); }
	 * 
	 * @ParameterizedTest
	 * 
	 * @EmptySource public void
	 * test_isBlank_returnsTrueIfStringIsBlank_EmptySource(String str) {
	 * assertTrue(StringUtils.isBlank(str)); }
	 */
	
	@ParameterizedTest
	@NullAndEmptySource
	public void test_isBlank_returnsTrueIfStringIsBlank(String str) {
		assertTrue(StringUtils.isBlank(str));
	}

}
