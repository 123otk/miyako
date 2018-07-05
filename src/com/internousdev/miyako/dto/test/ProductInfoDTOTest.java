package com.internousdev.miyako.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.miyako.dto.ProductInfoDTO;
public class ProductInfoDTOTest {
int max = 2147483647;
int min = -2147483648;
String exmax = "2147483648";
String exmin = "-2147483649";

	@Test
	public void testGetId1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int excepted = 0;
		dto.setId(excepted);

		int actual = dto.getId();
		assertEquals(excepted, actual);
	}

	@Test
	public void testSetId1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int excepted = 0;
		dto.setId(excepted);

		int actual = dto.getId();
		assertEquals(excepted , actual);
	}

	@Test
	public void testGetId2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int excepted = max;
		dto.setId(excepted);

		int actual = dto.getId();
		assertEquals(excepted, actual);
	}

	@Test
	public void testSetId2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int excepted = max;
		dto.setId(excepted);

		int actual = dto.getId();
		assertEquals(excepted , actual);
	}

	@Test
	public void testGetId3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int excepted = min;
		dto.setId(excepted);

		int actual = dto.getId();
		assertEquals(excepted , actual);
	}

	@Test
	public void testSetId3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int excepted = min;
		dto.setId(excepted);

		int actual = dto.getId();
		assertEquals(excepted , actual);
	}

	@Test
	public void testGetId4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{

		int excepted = Integer.parseInt(exmax);
		dto.setId(excepted);

		int actual = dto.getId();
		assertEquals(excepted , actual);
	}catch(RuntimeException e){
		assertEquals(e.getMessage(), "For input string: \"2147483648\"");
	}
	}

	@Test
	public void testSetId4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{

		int excepted = Integer.parseInt(exmax);
		dto.setId(excepted);

		int actual = dto.getId();
		assertEquals(excepted , actual);
	}catch(RuntimeException e){
		assertEquals(e.getMessage(), "For input string: \"2147483648\"");
	}
	}

	@Test
	public void testGetId5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{

		int excepted = Integer.parseInt(exmin);
		dto.setId(excepted);

		int actual = dto.getId();
		assertEquals(excepted , actual);
	}catch(RuntimeException e){
		assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
	}
	}

	@Test
	public void testSetId5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{

		int excepted = Integer.parseInt(exmin);
		dto.setId(excepted);

		int actual = dto.getId();
		assertEquals(excepted , actual);
	}catch(RuntimeException e){
		assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
	}
	}


	@Test
	public void testGetProductId1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;
		dto.setProductId(expected);

		int actual = dto.getProductId();
		assertEquals(expected , actual);
	}


	@Test
	public void testSetProductId1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;
		dto.setProductId(expected);

		int actual = dto.getProductId();
		assertEquals(expected , actual);
	}


	@Test
	public void testGetProductId2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = max;
		dto.setProductId(expected);

		int actual = dto.getProductId();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetProductId2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = max;
		dto.setProductId(expected);

		int actual = dto.getProductId();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetProductId3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = min;
		dto.setProductId(expected);

		int actual = dto.getProductId();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetProductId3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = min;
		dto.setProductId(expected);

		int actual = dto.getProductId();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetProductId4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{

		int expected = Integer.parseInt(exmax);
		dto.setProductId(expected);

		int actual = dto.getProductId();
		assertEquals(expected , actual);
	}catch(RuntimeException e){
		assertEquals(e.getMessage(), "For input string: \"2147483648\"");
	}
	}


	@Test
	public void testSetProductId4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{

		int expected = Integer.parseInt(exmax);
		dto.setProductId(expected);

		int actual = dto.getProductId();
		assertEquals(expected , actual);
	}catch(RuntimeException e){
		assertEquals(e.getMessage(), "For input string: \"2147483648\"");
	}
	}

	@Test
	public void testGetProductId5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{

		int expected = Integer.parseInt(exmin);
		dto.setProductId(expected);

		int actual = dto.getProductId();
		assertEquals(expected , actual);
	}catch(RuntimeException e){
		assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
	}
	}

	@Test
	public void testSetProductId5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{

		int expected = Integer.parseInt(exmin);
		dto.setProductId(expected);

		int actual = dto.getProductId();
		assertEquals(expected , actual);
	}catch(RuntimeException e){
		assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
	}
	}


	@Test
	public void testGetProductName1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;
		dto.setProductName(expected);

		String actual = dto.getProductName();
		assertEquals(expected , actual);

	}

	@Test
	public void testSetProductName1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;
		dto.setProductName(expected);

		String actual = dto.getProductName();
		assertEquals(expected , actual);
	}


	@Test
	public void testGetProductName2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";
		dto.setProductName(expected);

		String actual = dto.getProductName();
		assertEquals(expected , actual);

	}

	@Test
	public void testSetProductName2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";
		dto.setProductName(expected);

		String actual = dto.getProductName();
		assertEquals(expected , actual);

	}

	@Test
	public void testGetProductName3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";
		dto.setProductName(expected);

		String actual = dto.getProductName();
		assertEquals(expected , actual);

	}

	@Test
	public void testSetProductName3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";
		dto.setProductName(expected);

		String actual = dto.getProductName();
		assertEquals(expected , actual);

	}

	@Test
	public void testGetProductName4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";
		dto.setProductName(expected);

		String actual = dto.getProductName();
		assertEquals(expected , actual);

	}

	@Test
	public void testSetProductName4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";
		dto.setProductName(expected);

		String actual = dto.getProductName();
		assertEquals(expected , actual);

	}

	@Test
	public void testGetProductName5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";
		dto.setProductName(expected);

		String actual = dto.getProductName();
		assertEquals(expected , actual);

	}

	@Test
	public void testSetProductName5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";
		dto.setProductName(expected);

		String actual = dto.getProductName();
		assertEquals(expected , actual);

	}

	@Test
	public void testGetProductName6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";
		dto.setProductName(expected);

		String actual = dto.getProductName();
		assertEquals(expected , actual);

	}

	@Test
	public void testSetProductName6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";
		dto.setProductName(expected);

		String actual = dto.getProductName();
		assertEquals(expected , actual);

	}

	@Test
	public void testGetProductName7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setProductName(expected);

		String actual = dto.getProductName();
		assertEquals(expected , actual);

	}

	@Test
	public void testSetProductName7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setProductName(expected);

		String actual = dto.getProductName();
		assertEquals(expected , actual);

	}

	@Test
	public void testGetProductName8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setProductName(expected);

		String actual = dto.getProductName();
		assertEquals(expected , actual);

	}

	@Test
	public void testSetProductName8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setProductName(expected);

		String actual = dto.getProductName();
		assertEquals(expected , actual);

	}


	@Test
	public void testGetProductNameKana1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "null";
		dto.setProductNameKana(expected);

		String actual = dto.getProductNameKana();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetProductNameKana1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "null";
		dto.setProductNameKana(expected);

		String actual = dto.getProductNameKana();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetProductNameKana2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";
		dto.setProductNameKana(expected);

		String actual = dto.getProductNameKana();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetProductNameKana2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";
		dto.setProductNameKana(expected);

		String actual = dto.getProductNameKana();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetProductNameKana3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";
		dto.setProductNameKana(expected);

		String actual = dto.getProductNameKana();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetProductNameKana3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";
		dto.setProductNameKana(expected);

		String actual = dto.getProductNameKana();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetProductNameKana4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";
		dto.setProductNameKana(expected);

		String actual = dto.getProductNameKana();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetProductNameKana4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";
		dto.setProductNameKana(expected);

		String actual = dto.getProductNameKana();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetProductNameKana5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";
		dto.setProductNameKana(expected);

		String actual = dto.getProductNameKana();
		assertEquals(expected , actual);
	}


	@Test
	public void testSetProductNameKana5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";
		dto.setProductNameKana(expected);

		String actual = dto.getProductNameKana();
		assertEquals(expected , actual);
	}


	@Test
	public void testGetProductNameKana6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";
		dto.setProductNameKana(expected);

		String actual = dto.getProductNameKana();
		assertEquals(expected , actual);
	}


	@Test
	public void testSetProductNameKana6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";
		dto.setProductNameKana(expected);

		String actual = dto.getProductNameKana();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetProductNameKana7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";
		dto.setProductNameKana(expected);

		String actual = dto.getProductNameKana();
		assertEquals(expected , actual);
	}


	@Test
	public void testSetProductNameKana7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";
		dto.setProductNameKana(expected);

		String actual = dto.getProductNameKana();
		assertEquals(expected , actual);
	}


	@Test
	public void testGetProductNameKana8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setProductNameKana(expected);

		String actual = dto.getProductNameKana();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetProductNameKana8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setProductNameKana(expected);

		String actual = dto.getProductNameKana();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetProductNameKana9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setProductName(expected);

		String actual = dto.getProductName();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetProductNameKana9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setProductName(expected);

		String actual = dto.getProductName();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetProductDescription1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "null";
		dto.setProductDescription(expected);

		String actual = dto.getProductDescription();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetProductDescription1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "null";
		dto.setProductDescription(expected);

		String actual = dto.getProductDescription();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetProductDescription2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";
		dto.setProductDescription(expected);

		String actual = dto.getProductDescription();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetProductDescription2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";
		dto.setProductDescription(expected);

		String actual = dto.getProductDescription();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetProductDescription3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";
		dto.setProductDescription(expected);

		String actual = dto.getProductDescription();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetProductDescription3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";
		dto.setProductDescription(expected);

		String actual = dto.getProductDescription();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetProductDescription4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";
		dto.setProductDescription(expected);

		String actual = dto.getProductDescription();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetProductDescription4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";
		dto.setProductDescription(expected);

		String actual = dto.getProductDescription();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetProductDescription5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";
		dto.setProductDescription(expected);

		String actual = dto.getProductDescription();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetProductDescription5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";
		dto.setProductDescription(expected);

		String actual = dto.getProductDescription();
		assertEquals(expected , actual);
	}


	@Test
	public void testGetProductDescription6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";
		dto.setProductDescription(expected);

		String actual = dto.getProductDescription();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetProductDescription6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";
		dto.setProductDescription(expected);

		String actual = dto.getProductDescription();
		assertEquals(expected , actual);
	}
	@Test
	public void testGetProductDescription7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setProductDescription(expected);

		String actual = dto.getProductDescription();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetProductDescription7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setProductDescription(expected);

		String actual = dto.getProductDescription();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetProductDescription8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setProductDescription(expected);

		String actual = dto.getProductDescription();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetProductDescription8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setProductDescription(expected);

		String actual = dto.getProductDescription();
		assertEquals(expected , actual);
	}


	@Test
	public void testGetCategoryId1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;
		dto.setCategoryId(expected);

		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}



	@Test
	public void testSetCategoryId1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;
		dto.setCategoryId(expected);

		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryId2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = max;
		dto.setCategoryId(expected);

		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryId3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = min;
		dto.setCategoryId(expected);

		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}


	@Test
	public void testSetCategoryId3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = min;
		dto.setCategoryId(expected);

		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}



	@Test
	public void testGetCategoryId4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{

		int expected = Integer.parseInt(exmax);
		dto.setCategoryId(expected);

		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetCategoryId4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{

		int expected = Integer.parseInt(exmax);
		dto.setCategoryId(expected);

		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetCategoryId5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{

		int expected = Integer.parseInt(exmin);
		dto.setCategoryId(expected);

		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetCategoryId5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{

		int expected = Integer.parseInt(exmin);
		dto.setCategoryId(expected);

		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}


	@Test
	public void testGetPrice1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;
		dto.setPrice(expected);

		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;
		dto.setPrice(expected);

		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPrice2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = max;
		dto.setPrice(expected);

		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = max;
		dto.setPrice(expected);

		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPrice3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = min;
		dto.setPrice(expected);

		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = min;
		dto.setPrice(expected);

		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPrice4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{

		int expected = Integer.parseInt(exmax);
		dto.setPrice(expected);

		int actual = dto.getPrice();
		assertEquals(expected, actual);
		}catch(RuntimeException e){
		assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
		}

	@Test
	public void testSetPrice4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{

		int expected = Integer.parseInt(exmax);
		dto.setPrice(expected);

		int actual = dto.getPrice();
		assertEquals(expected, actual);
		}catch(RuntimeException e){
		assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
		}


	@Test
	public void testGetPrice5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{

		int expected = Integer.parseInt(exmin);
		dto.setPrice(expected);

		int actual = dto.getPrice();
		assertEquals(expected, actual);
		}catch(RuntimeException e){
		assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
		}

	@Test
	public void testSetPrice5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{

		int expected = Integer.parseInt(exmin);
		dto.setPrice(expected);

		int actual = dto.getPrice();
		assertEquals(expected, actual);
		}catch(RuntimeException e){
		assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
		}


	@Test
	public void testGetProductStock1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;
		dto.setProductStock(expected);

		int actual = dto.getProductStock();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductStock1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;
		dto.setProductStock(expected);

		int actual = dto.getProductStock();
		assertEquals(expected , actual);
	}


	@Test
	public void testGetProductStock2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = max;
		dto.setProductStock(expected);

		int actual = dto.getProductStock();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductStock2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = max;
		dto.setProductStock(expected);

		int actual = dto.getProductStock();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductStock3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = min;
		dto.setProductStock(expected);

		int actual = dto.getProductStock();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductStock3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = min;
		dto.setProductStock(expected);

		int actual = dto.getProductStock();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductStock4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
		int expected = Integer.parseInt(exmax);
		dto.setProductStock(expected);

		int actual = dto.getProductStock();
		assertEquals(expected, actual);

		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetProductStock4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
		int expected = Integer.parseInt(exmax);
		dto.setProductStock(expected);

		int actual = dto.getProductStock();
		assertEquals(expected, actual);

		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetProductStock5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
		int expected = Integer.parseInt(exmin);
		dto.setProductStock(expected);

		int actual = dto.getProductStock();
		assertEquals(expected, actual);

		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetProductStock5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
		int expected = Integer.parseInt(exmin);
		dto.setProductStock(expected);

		int actual = dto.getProductStock();
		assertEquals(expected, actual);

		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}


	@Test
	public void testGetImageFilePath1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;
		dto.setImageFilePath(expected);

		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);

	}

	@Test
	public void testSetImageFilePath1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;
		dto.setImageFilePath(expected);

		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}


	@Test
	public void testGetImageFilePath2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";
		dto.setImageFilePath(expected);

		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);

	}


	@Test
	public void testSetImageFilePath2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";
		dto.setImageFilePath(expected);

		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);

	}


	@Test
	public void testGetImageFilePath3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";
		dto.setImageFilePath(expected);

		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);

	}


	@Test
	public void testSetImageFilePath3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";
		dto.setImageFilePath(expected);

		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);

	}


	@Test
	public void testGetImageFilePath4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";
		dto.setImageFilePath(expected);

		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);

	}

	@Test
	public void testSetImageFilePath4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";
		dto.setImageFilePath(expected);

		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);

	}

	@Test
	public void testGetImageFilePath5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";
		dto.setImageFilePath(expected);

		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);

	}

	@Test
	public void testSetImageFilePath5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";
		dto.setImageFilePath(expected);

		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);

	}

	@Test
	public void testGetImageFilePath6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";
		dto.setImageFilePath(expected);

		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);

	}

	@Test
	public void testSetImageFilePath6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";
		dto.setImageFilePath(expected);

		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);

	}

	@Test
	public void testGetImageFilePath7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setImageFilePath(expected);

		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);

	}

	@Test
	public void testSetImageFilePath7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setImageFilePath(expected);

		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);

	}

	@Test
	public void testGetImageFilePath9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setImageFilePath(expected);

		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);

	}

	@Test
	public void testSetImageFilePath9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setImageFilePath(expected);

		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);

	}




	@Test
	public void testGetImageFileName1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;
		dto.setImageFileName(expected);

		String actual = dto.getImageFileName();
		assertEquals(expected , actual);

	}

	@Test
	public void testSetImageFileName1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;
		dto.setImageFileName(expected);

		String actual = dto.getImageFileName();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetImageFileName2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";
		dto.setImageFileName(expected);

		String actual = dto.getImageFileName();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetImageFileName2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";
		dto.setImageFileName(expected);

		String actual = dto.getImageFileName();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetImageFileName3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";
		dto.setImageFileName(expected);

		String actual = dto.getImageFileName();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetImageFileName3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";
		dto.setImageFileName(expected);

		String actual = dto.getImageFileName();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetImageFileName4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";
		dto.setImageFileName(expected);

		String actual = dto.getImageFileName();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetImageFileName4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";
		dto.setImageFileName(expected);

		String actual = dto.getImageFileName();
		assertEquals(expected , actual);
	}


	@Test
	public void testGetImageFileName5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";
		dto.setImageFileName(expected);

		String actual = dto.getImageFileName();
		assertEquals(expected , actual);
	}


	@Test
	public void testSetImageFileName5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";
		dto.setImageFileName(expected);

		String actual = dto.getImageFileName();
		assertEquals(expected , actual);
	}


	@Test
	public void testGetImageFileName6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";
		dto.setImageFileName(expected);

		String actual = dto.getImageFileName();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetImageFileName6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";
		dto.setImageFileName(expected);

		String actual = dto.getImageFileName();
		assertEquals(expected , actual);
	}


	@Test
	public void testGetImageFileName7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setImageFileName(expected);

		String actual = dto.getImageFileName();
		assertEquals(expected , actual);
	}


	@Test
	public void testSetImageFileName7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setImageFileName(expected);

		String actual = dto.getImageFileName();
		assertEquals(expected , actual);
	}


	@Test
	public void testGetImageFileName8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setImageFileName(expected);

		String actual = dto.getImageFileName();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetImageFileName8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setImageFileName(expected);

		String actual = dto.getImageFileName();
		assertEquals(expected , actual);
	}



	@Test
	public void testGetReleaseCompany1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;
		dto.setReleaseCompany(expected);

		String actual = dto.getReleaseCompany();
		assertEquals(expected , actual);

	}

	@Test
	public void testSetReleaseCompany1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;
		dto.setReleaseCompany(expected);

		String actual = dto.getReleaseCompany();
		assertEquals(expected , actual);

	}

	@Test
	public void testGetReleaseCompany2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";
		dto.setReleaseCompany(expected);

		String actual = dto.getReleaseCompany();
		assertEquals(expected , actual);

	}

	@Test
	public void testSetReleaseCompany2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";
		dto.setReleaseCompany(expected);

		String actual = dto.getReleaseCompany();
		assertEquals(expected , actual);

	}

	@Test
	public void testGetReleaseCompany3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";
		dto.setReleaseCompany(expected);

		String actual = dto.getReleaseCompany();
		assertEquals(expected , actual);

	}

	@Test
	public void testSetReleaseCompany3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";
		dto.setReleaseCompany(expected);

		String actual = dto.getReleaseCompany();
		assertEquals(expected , actual);

	}

	@Test
	public void testGetReleaseCompany4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";
		dto.setReleaseCompany(expected);

		String actual = dto.getReleaseCompany();
		assertEquals(expected , actual);

	}

	@Test
	public void testSetReleaseCompany4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";
		dto.setReleaseCompany(expected);

		String actual = dto.getReleaseCompany();
		assertEquals(expected , actual);

	}
	@Test
	public void testGetReleaseCompany5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";
		dto.setReleaseCompany(expected);

		String actual = dto.getReleaseCompany();
		assertEquals(expected , actual);

	}


	@Test
	public void testSetReleaseCompany5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";
		dto.setReleaseCompany(expected);

		String actual = dto.getReleaseCompany();
		assertEquals(expected , actual);

	}

	@Test
	public void testGetReleaseCompany6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";
		dto.setReleaseCompany(expected);

		String actual = dto.getReleaseCompany();
		assertEquals(expected , actual);

	}

	@Test
	public void testSetReleaseCompany6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";
		dto.setReleaseCompany(expected);

		String actual = dto.getReleaseCompany();
		assertEquals(expected , actual);

	}

	@Test
	public void testGetReleaseCompany7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setReleaseCompany(expected);

		String actual = dto.getReleaseCompany();
		assertEquals(expected , actual);

	}

	@Test
	public void testSetReleaseCompany7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setReleaseCompany(expected);

		String actual = dto.getReleaseCompany();
		assertEquals(expected , actual);

	}

	@Test
	public void testGetReleaseCompany8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setReleaseCompany(expected);

		String actual = dto.getReleaseCompany();
		assertEquals(expected , actual);

	}

	@Test
	public void testSetReleaseCompany8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setReleaseCompany(expected);

		String actual = dto.getReleaseCompany();
		assertEquals(expected , actual);

	}
	@Test
	public void testGetStatus1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;
		dto.setStatus(expected);

		int actual = dto.getStatus();
		assertEquals(expected, actual);
	}



	@Test
	public void testSetStatus1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;
		dto.setStatus(expected);

		int actual = dto.getStatus();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetStatus2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = max;
		dto.setStatus(expected);

		int actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetStatus2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = max;
		dto.setStatus(expected);

		int actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetStatus3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = min;
		dto.setStatus(expected);

		int actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetStatus3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = min;
		dto.setStatus(expected);

		int actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetStatus4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
		int expected = Integer.parseInt(exmax);
		dto.setStatus(expected);

		int actual = dto.getStatus();
		assertEquals(expected, actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetStatus4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
		int expected = Integer.parseInt(exmax);
		dto.setStatus(expected);

		int actual = dto.getStatus();
		assertEquals(expected, actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetStatus5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
		int expected = Integer.parseInt(exmin);
		dto.setStatus(expected);

		int actual = dto.getStatus();
		assertEquals(expected, actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}


	@Test
	public void testSetStatus5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
		int expected = Integer.parseInt(exmin);
		dto.setStatus(expected);

		int actual = dto.getStatus();
		assertEquals(expected, actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}




}
