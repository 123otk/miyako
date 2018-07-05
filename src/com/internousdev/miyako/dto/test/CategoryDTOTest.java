package com.internousdev.miyako.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.miyako.dto.CategoryDTO;

public class CategoryDTOTest {


	//start test for getId    int
	@Test
	public void testGetId01() {
		CategoryDTO dto = new CategoryDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId02() {
		CategoryDTO dto = new CategoryDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId03() {
		CategoryDTO dto = new CategoryDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId04() {
		CategoryDTO dto = new CategoryDTO();
		try {
			int Max = Integer.parseInt("214748364");
			dto.setId(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetId05() {
		CategoryDTO dto = new CategoryDTO();
		try {
			int Max = Integer.parseInt("-214748364");
			dto.setId(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//finish test for getId    int

	//start test for setId    int

	@Test
	public void testSetId01() {
		CategoryDTO dto = new CategoryDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId02() {
		CategoryDTO dto = new CategoryDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}


	@Test
	public void testSetId03() {
		CategoryDTO dto = new CategoryDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}


	@Test
	public void testSetId04() {
		CategoryDTO dto = new CategoryDTO();
		try {
			int Max = Integer.parseInt("214748364");
			dto.setId(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetId05() {
		CategoryDTO dto = new CategoryDTO();
		try {
			int Max = Integer.parseInt("-214748364");
			dto.setId(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//finish test for setId    int


	//start test for getCategoryId    int
	@Test
	public void testGetCategoryId01() {
		CategoryDTO dto = new CategoryDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryId02() {
		CategoryDTO dto = new CategoryDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryId03() {
		CategoryDTO dto = new CategoryDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryId04() {
		CategoryDTO dto = new CategoryDTO();
		try {
			int Max = Integer.parseInt("214748364");
			dto.setId(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetCategoryId05() {
		CategoryDTO dto = new CategoryDTO();
		try {
			int Max = Integer.parseInt("-214748364");
			dto.setId(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}


	//finish test for getCategoryId    int


	//start test for setCategoryId    int

	@Test
	public void testSetCategoryId01() {
		CategoryDTO dto = new CategoryDTO();
		int expected = 0;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryId02() {
		CategoryDTO dto = new CategoryDTO();
		int expected = 2147483647;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryId03() {
		CategoryDTO dto = new CategoryDTO();
		int expected = -2147483647;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryId04() {
		CategoryDTO dto = new CategoryDTO();

		try {
			int Max = Integer.parseInt("214748364");
			dto.setCategoryId(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetCategoryId05() {
		CategoryDTO dto = new CategoryDTO();
		try {
			int Max = Integer.parseInt("-214748364");
			dto.setCategoryId(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//finish test for setId    int

	//start test for getCategoryName    string

	@Test
	public void testGetCategoryName01() {
		CategoryDTO dto = new CategoryDTO();
		String expected = null;

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryName02() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryName03() {
		CategoryDTO dto = new CategoryDTO();
		String expected = " ";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryName04() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "　";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryName05() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryName06() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "あいう１２３";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryName07() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123あいう１２３";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryName08() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	//finish test for getCategoryName

	//start test for setCategoryName    string

	@Test
	public void testSetCategoryName01() {
		CategoryDTO dto = new CategoryDTO();
		String expected = null;

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryName02() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryName03() {
		CategoryDTO dto = new CategoryDTO();
		String expected = " ";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryName04() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "　";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryName05() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryName06() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "あいう１２３";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryName07() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryName08() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}


	//finish test for setCategoryName

	//start test for getCategoryDescription  string

	@Test
	public void testGetCategoryDescription01() {
		CategoryDTO dto = new CategoryDTO();
		String expected = null;

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryDescription02() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryDescription03() {
		CategoryDTO dto = new CategoryDTO();
		String expected = " ";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryDescription04() {
		CategoryDTO dto = new CategoryDTO();
		String expected = " ";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryDescription05() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryDescription06() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "あいう１２３";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryDescription07() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123あいう１２３";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryDescription08() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	//finish test for getCategoryDescription

	//start test for setCategoryDescription string

	@Test
	public void testSetCategoryDescription01() {
		CategoryDTO dto = new CategoryDTO();
		String expected = null;

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	public void testSetCategoryDescription02() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	public void testSetCategoryDescription03() {
		CategoryDTO dto = new CategoryDTO();
		String expected = " ";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	public void testSetCategoryDescription04() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "　";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	public void testSetCategoryDescription05() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	public void testSetCategoryDescription06() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "あいう１２３";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	public void testSetCategoryDescription07() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123あいう１２３";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	public void testSetCategoryDescription08() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}


	//finish test for setCategoryDescription

}
