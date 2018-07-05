package com.internousdev.miyako.dto.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.internousdev.miyako.dto.PaginationDTO;
import com.internousdev.miyako.dto.ProductInfoDTO;
public class PaginationDTOTest {

	@Test
	public void testGetTotalPageSize1() {
		PaginationDTO dto = new PaginationDTO();
		int expected = 0;
		dto.setTotalPageSize(expected);

		int actual = dto.getTotalPageSize();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTotalPageSize1() {
		PaginationDTO dto = new PaginationDTO();
		int expected = 0;
		dto.setTotalPageSize(expected);

		int actual = dto.getTotalPageSize();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetTotalPageSize2() {
		PaginationDTO dto = new PaginationDTO();
		int expected = 2147483647;
		dto.setTotalPageSize(expected);

		int actual = dto.getTotalPageSize();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTotalPageSize2() {
		PaginationDTO dto = new PaginationDTO();
		int expected = 2147483647;
		dto.setTotalPageSize(expected);

		int actual = dto.getTotalPageSize();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTotalPageSize3() {
		PaginationDTO dto = new PaginationDTO();
		int expected = -2147483648;
		dto.setTotalPageSize(expected);

		int actual = dto.getTotalPageSize();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTotalPageSize3() {
		PaginationDTO dto = new PaginationDTO();
		int expected = -2147483648;
		dto.setTotalPageSize(expected);

		int actual = dto.getTotalPageSize();
		assertEquals(expected, actual);
	}

	//最大値以上
	@Test
	public void testGetTotalPageSize4() {
		PaginationDTO dto = new PaginationDTO();
		try{
			int expected = Integer.parseInt("2147483648");
			dto.setTotalPageSize(expected);

			int actual= dto.getTotalPageSize();
			assertEquals(expected, actual);
		}catch (RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}

	}

	@Test
	public void testSetTotalPageSize4() {
		PaginationDTO dto = new PaginationDTO();
		try{
		int expected = Integer.parseInt("2147483648");
		dto.setTotalPageSize(expected);

		int actual = dto.getTotalPageSize();
		assertEquals(expected, actual);
		}catch (RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	//最小値以下
	@Test
	public void testGetTotalPageSize5() {
		PaginationDTO dto = new PaginationDTO();
		try{
			int expected = Integer.parseInt("-2147483649");
			dto.setTotalPageSize(expected);

			int actual = dto.getTotalPageSize();
			assertEquals(expected, actual);
		}catch (RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}

	}

	@Test
	public void testSetTotalPageSize5() {
		PaginationDTO dto = new PaginationDTO();
		try{
			int expected = Integer.parseInt("-2147483649");
			dto.setTotalPageSize(expected);

			int actual = dto.getTotalPageSize();
			assertEquals(expected, actual);
		}catch (RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}

	}


	@Test
	public void testGetCurrentPageNo1() {
		PaginationDTO dto = new PaginationDTO();
		int expected = 0;
		dto.setCurrentPageNo(expected);

		int actual = dto.getCurrentPageNo();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCurrentPageNo1() {
		PaginationDTO dto = new PaginationDTO();
		int expected = 0;
		dto.setCurrentPageNo(expected);

		int actual = dto.getCurrentPageNo();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCurrentPageNo2() {
		PaginationDTO dto = new PaginationDTO();
		int expected = 2147483647;
		dto.setCurrentPageNo(expected);

		int actual = dto.getCurrentPageNo();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCurrentPageNo2() {
		PaginationDTO dto = new PaginationDTO();
		int expected = 2147483647;
		dto.setCurrentPageNo(expected);

		int actual = dto.getCurrentPageNo();
		assertEquals(expected, actual);
	}


	@Test
	public void testGetCurrentPageNo3() {
		PaginationDTO dto = new PaginationDTO();
		int expected = -2147483648;
		dto.setCurrentPageNo(expected);

		int actual = dto.getCurrentPageNo();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCurrentPageNo3(){
		PaginationDTO dto = new PaginationDTO();
		int expected = -2147483648;
		dto.setCurrentPageNo(expected);

		int actual = dto.getCurrentPageNo();
		assertEquals(expected,actual);
	}

	//最大値以上
	@Test
	public void testGetCurrentPageNo4() {
		PaginationDTO dto = new PaginationDTO();
		try{
			int expected = Integer.parseInt("2147483648");
			dto.setCurrentPageNo(expected);

			int actual = dto.getCurrentPageNo();
			assertEquals(expected, actual);
		}catch (RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}

	}

	@Test
	public void testSetCurrentPageNo4(){
		PaginationDTO dto = new PaginationDTO();
		try{
			int expected = Integer.parseInt("2147483648");
			dto.setCurrentPageNo(expected);

			int actual = dto.getCurrentPageNo();
			assertEquals(expected, actual);
		}catch (RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	//最小値以下
	@Test
	public void testSetCurrentPageNo5(){
		PaginationDTO dto = new PaginationDTO();
		try{
			int expected = Integer.parseInt("-2147483649");
			dto.setCurrentPageNo(expected);

			int actual = dto.getCurrentPageNo();
			assertEquals(expected, actual);
		}catch (RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetCurrentPageNo5(){
		PaginationDTO dto = new PaginationDTO();
		try{
			int expected = Integer.parseInt("-2147483649");
			dto.setCurrentPageNo(expected);
			assertEquals(expected, dto.getCurrentPageNo());
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}


	@Test
	public void testGetTotalRecordSize1() {
		PaginationDTO dto = new PaginationDTO();
		int expected = 0;
		dto.setTotalRecordSize(expected);

		int actual = dto.getTotalRecordSize();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetTotalRecordSize1() {
		PaginationDTO dto = new PaginationDTO();
		int expected = 0;
		dto.setTotalRecordSize(expected);

		int actual = dto.getTotalRecordSize();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTotalRecordSize2(){
		PaginationDTO dto = new PaginationDTO();
		int expected = 2147483647;
		dto.setTotalRecordSize(expected);

		int actual = dto.getTotalRecordSize();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetTotalRecordSize2() {
		PaginationDTO dto = new PaginationDTO();
		int expected = 2147483647;
		dto.setTotalRecordSize(expected);

		int actual = dto.getTotalRecordSize();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTotalRecordSize3(){
		PaginationDTO dto = new PaginationDTO();
		int expected = -2147483648;
		dto.setTotalRecordSize(expected);

		int actual = dto.getTotalRecordSize();
		assertEquals(expected,actual);
	}


	@Test
	public void testSetTotalRecordSize3() {
		PaginationDTO dto = new PaginationDTO();
		int expected = -2147483648;
		dto.setTotalRecordSize(expected);

		int actual = dto.getTotalRecordSize();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTotalRecordSize4(){
		PaginationDTO dto = new PaginationDTO();
		try {
			int expected = Integer.parseInt("2147483648");
			dto.setTotalRecordSize(expected);

			int actual = dto.getTotalRecordSize();
			assertEquals(expected,actual);
		}catch (RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");

		}
	}

	@Test
	public void testSetTotalRecordSize4(){
		PaginationDTO dto = new PaginationDTO();
		try {
			int expected = Integer.parseInt("2147483648");
			dto.setTotalRecordSize(expected);

			int actual = dto.getTotalRecordSize();
			assertEquals(expected,actual);
		}catch (RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");

		}
	}

	@Test
	public void testGetTotalRecordSize5(){
		PaginationDTO dto = new PaginationDTO();
		try {
			int expected = Integer.parseInt("-2147483649");
			dto.setTotalRecordSize(expected);

			int actual = dto.getTotalRecordSize();
			assertEquals(expected,actual);
		}catch (RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");

		}
	}

	@Test
	public void testSetTotalRecordSize5(){
		PaginationDTO dto = new PaginationDTO();
		try {
			int expected = Integer.parseInt("-2147483649");
			dto.setTotalRecordSize(expected);

			int actual = dto.getTotalRecordSize();
			assertEquals(expected,actual);
		}catch (RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");

		}
	}


	@Test
	public void testGetStartRecordNo1() {
		PaginationDTO dto = new PaginationDTO();
		int expected = 0;
		dto.setStartRecordNo(expected);

		int actual = dto.getStartRecordNo();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetStartRecordNo1() {
		PaginationDTO dto = new PaginationDTO();
		int expected = 0;
		dto.setStartRecordNo(expected);

		int actual = dto.getStartRecordNo();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetStartRecordNo2() {
		PaginationDTO dto = new PaginationDTO();
		int expected = 2147483647;
		dto.setStartRecordNo(expected);

		int actual = dto.getStartRecordNo();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetStartRecordNo2() {
		PaginationDTO dto = new PaginationDTO();
		int expected = 2147483647;
		dto.setStartRecordNo(expected);

		int actual = dto.getStartRecordNo();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetStartRecordNo3(){
		PaginationDTO dto = new PaginationDTO();
		int expected = -2147483648;
		dto.setStartRecordNo(expected);

		int actual = dto.getStartRecordNo();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetStartRecordNo3(){
		PaginationDTO dto = new PaginationDTO();
		int expected = -2147483648;
		dto.setStartRecordNo(expected);

		int actual = dto.getStartRecordNo();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetStartRecordNo4(){
		PaginationDTO dto = new PaginationDTO();
		try{
			int expected = Integer.parseInt("2147483648");
			dto.setStartRecordNo(expected);

			int actual = dto.getStartRecordNo();
			assertEquals(expected,actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetStartRecordNo4(){
		PaginationDTO dto = new PaginationDTO();
		try{
			int expected = Integer.parseInt("2147483648");
			dto.setStartRecordNo(expected);

			int actual = dto.getStartRecordNo();
			assertEquals(expected,actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}


	@Test
	public void testGetStartRecordNo5(){
		PaginationDTO dto = new PaginationDTO();
		try{
			int expected = Integer.parseInt("-2147483649");
			dto.setStartRecordNo(expected);

			int actual = dto.getStartRecordNo();
			assertEquals(expected,actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetStartRecordNo5(){
		PaginationDTO dto = new PaginationDTO();
		try{
			int expected = Integer.parseInt("-2147483649");
			dto.setStartRecordNo(expected);

			int actual =dto.getStartRecordNo();
			assertEquals(expected, actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}


	@Test
	public void testGetEndRecordNo1() {
		PaginationDTO dto = new PaginationDTO();
		int expected = 0;
		dto.setEndRecordNo(expected);

		int actual = dto.getEndRecordNo();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetEndRecordNo1() {
		PaginationDTO dto = new PaginationDTO();
		int expected = 0;
		dto.setEndRecordNo(expected);

		int actual = dto.getEndRecordNo();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEndRecordNo2() {
		PaginationDTO dto = new PaginationDTO();
		int expected = 2147483647;
		dto.setEndRecordNo(expected);

		int actual =dto.getEndRecordNo();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetEndRecordNo2() {
		PaginationDTO dto = new PaginationDTO();
		int expected = 2147483647;
		dto.setEndRecordNo(expected);

		int actual = dto.getEndRecordNo();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEndRecordNo3() {
		PaginationDTO dto = new PaginationDTO();
		int expected = -2147483648;
		dto.setEndRecordNo(expected);

		int actual = dto.getEndRecordNo();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetEndRecordNo3() {
		PaginationDTO dto = new PaginationDTO();
		int expected = -2147483648;
		dto.setEndRecordNo(expected);

		int actual = dto.getEndRecordNo();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEndRecordNo4() {
		PaginationDTO dto = new PaginationDTO();
		try{
			int expected = Integer.parseInt("2147483648");
			dto.setEndRecordNo(expected);

			int actual = dto.getEndRecordNo();
			assertEquals(expected , actual);

		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetEndRecordNo4() {
		PaginationDTO dto = new PaginationDTO();
		try{
			int expected = Integer.parseInt("2147483648");
			dto.setEndRecordNo(expected);

			int actual = dto.getEndRecordNo();
			assertEquals(expected, actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetEndRecordNo5() {
		PaginationDTO dto = new PaginationDTO();
		try{
			int expected = Integer.parseInt("-2147483649");
			dto.setEndRecordNo(expected);

			int actual = dto.getEndRecordNo();
			assertEquals(expected, actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetEndRecordNo5() {
		PaginationDTO dto = new PaginationDTO();
		try{
			int expected = Integer.parseInt("-2147483649");
			dto.setEndRecordNo(expected);

			int actual = dto.getEndRecordNo();
			assertEquals(expected , actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}


	@Test
	public void testGetPageNumberList1() {
		PaginationDTO dto = new PaginationDTO();

		Integer [] expected = {0};
		List<Integer> in = Arrays.asList(expected);
		dto.setPageNumberList(in);

		List<Integer> actual = dto.getPageNumberList();
		assertEquals(in ,actual);
	}

	@Test
	public void testSetPageNumberList1() {
		PaginationDTO dto = new PaginationDTO();
		Integer [] expected = {0};
		List<Integer> in = Arrays.asList(expected);
		dto.setPageNumberList(in);

		List<Integer> actual = dto.getPageNumberList();
		assertEquals(in ,actual);

	}

	@Test
	public void testGetPageNumberList2() {
		PaginationDTO dto = new PaginationDTO();

		Integer [] expected = {2147483647};
		List<Integer> in = Arrays.asList(expected);
		dto.setPageNumberList(in);

		List<Integer> actual = dto.getPageNumberList();
		assertEquals(in ,actual);
	}

	@Test
	public void testSetPageNumberList2() {
		PaginationDTO dto = new PaginationDTO();
		Integer [] expected = {2147483647};
		List<Integer> in = Arrays.asList(expected);
		dto.setPageNumberList(in);

		List<Integer> actual = dto.getPageNumberList();
		assertEquals(in ,actual);

	}

	@Test
	public void testGetPageNumberList3() {
		PaginationDTO dto = new PaginationDTO();

		Integer [] expected = {-2147483648};
		List<Integer> in = Arrays.asList(expected);
		dto.setPageNumberList(in);

		List<Integer> actual = dto.getPageNumberList();
		assertEquals(in ,actual);
	}

	@Test
	public void testSetPageNumberList3() {
		PaginationDTO dto = new PaginationDTO();

		Integer [] expected = {-2147483648};
		List<Integer> in = Arrays.asList(expected);
		dto.setPageNumberList(in);

		List<Integer> actual = dto.getPageNumberList();
		assertEquals(in ,actual);
	}

	@Test
	public void testGetPageNumberList4(){
		PaginationDTO  dto = new PaginationDTO();
		try{
			Integer [] expected = {Integer.parseInt("2147483648")};
			List<Integer> in = Arrays.asList(expected);
			dto.setPageNumberList(in);

			List<Integer> actual = dto.getPageNumberList();
			assertEquals(in , actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetPageNumberList4(){
		PaginationDTO  dto = new PaginationDTO();
		try{
			Integer [] expected = {Integer.parseInt("2147483648")};
			List<Integer> in = Arrays.asList(expected);
			dto.setPageNumberList(in);

			List<Integer> actual = dto.getPageNumberList();
			assertEquals(in , actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetPageNumberList5(){
		PaginationDTO  dto = new PaginationDTO();
		try{
			Integer [] expected = {Integer.parseInt("-2147483649")};
			List<Integer> in = Arrays.asList(expected);
			dto.setPageNumberList(in);

			List<Integer> actual = dto.getPageNumberList();
			assertEquals(in , actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetPageNumberList5(){
		PaginationDTO  dto = new PaginationDTO();
		try{
			Integer [] expected = {Integer.parseInt("-2147483649")};
			List<Integer> in = Arrays.asList(expected);
			dto.setPageNumberList(in);

			List<Integer> actual = dto.getPageNumberList();
			assertEquals(in.get(0) , actual.get(0));
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetCurrentProductInfoPage1() {
		PaginationDTO dto = new PaginationDTO();
		ProductInfoDTO product = new ProductInfoDTO();

		int expected = 0;
		product.setId(expected);
		List<ProductInfoDTO> list = Arrays.asList(product);
		dto.setCurrentProductInfoPage(list);

		List<ProductInfoDTO> actual = dto.getCurrentProductInfoPage();
		assertEquals(expected, actual.get(0).getId());

	}

	@Test
	public void testSetCurrentProductInfoPage1() {
		PaginationDTO dto = new PaginationDTO();
		ProductInfoDTO product = new ProductInfoDTO();
		
		int expected = 0;
		product.setId(expected);
		List<ProductInfoDTO> list = Arrays.asList(product);
		dto.setCurrentProductInfoPage(list);
		
		List<ProductInfoDTO> actual = dto.getCurrentProductInfoPage();
		assertEquals(expected, actual.get(0).getId());
	}

	@Test
	public void testGetCurrentProductInfoPage2() {
		PaginationDTO dto = new PaginationDTO();
		ProductInfoDTO product = new ProductInfoDTO();

		int expected = 2147483647;
		product.setId(expected);
		List<ProductInfoDTO> list = Arrays.asList(product);
		dto.setCurrentProductInfoPage(list);

		List<ProductInfoDTO> actual = dto.getCurrentProductInfoPage();
		assertEquals(expected, actual.get(0).getId());

	}
	
	@Test
	public void testSetCurrentProductInfoPage2() {
		PaginationDTO dto = new PaginationDTO();
		ProductInfoDTO product = new ProductInfoDTO();
		
		int expected = 2147483647;
		product.setId(expected);
		List<ProductInfoDTO> list = Arrays.asList(product);
		dto.setCurrentProductInfoPage(list);
		
		List<ProductInfoDTO> actual = dto.getCurrentProductInfoPage();
		assertEquals(expected, actual.get(0).getId());
	}
	

	@Test
	public void testGetCurrentProductInfoPage3() {
		PaginationDTO dto = new PaginationDTO();
		ProductInfoDTO product = new ProductInfoDTO();

		int expected = -2147483648;
		product.setId(expected);
		List<ProductInfoDTO> list = Arrays.asList(product);
		dto.setCurrentProductInfoPage(list);

		List<ProductInfoDTO> actual = dto.getCurrentProductInfoPage();
		assertEquals(expected, actual.get(0).getId());

	}
	

	@Test
	public void testSetCurrentProductInfoPage3() {
		PaginationDTO dto = new PaginationDTO();
		ProductInfoDTO product = new ProductInfoDTO();

		int expected = -2147483648;
		product.setId(expected);
		List<ProductInfoDTO> list = Arrays.asList(product);
		dto.setCurrentProductInfoPage(list);

		List<ProductInfoDTO> actual = dto.getCurrentProductInfoPage();
		assertEquals(expected, actual.get(0).getId());

	}
	
	@Test
	public void testGetCurrentProductInfoPage4() {
		PaginationDTO dto = new PaginationDTO();
		ProductInfoDTO product = new ProductInfoDTO();
		try{
		int expected = Integer.parseInt("2147483648");
		product.setId(expected);
		List<ProductInfoDTO> list = Arrays.asList(product);
		dto.setCurrentProductInfoPage(list);

		List<ProductInfoDTO> actual = dto.getCurrentProductInfoPage();
		assertEquals(expected, actual.get(0).getId());
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	
	@Test
	public void testSetCurrentProductInfoPage4() {
		PaginationDTO dto = new PaginationDTO();
		ProductInfoDTO product = new ProductInfoDTO();
		try{
		int expected = Integer.parseInt("2147483648");
		product.setId(expected);
		List<ProductInfoDTO> list = Arrays.asList(product);
		dto.setCurrentProductInfoPage(list);

		List<ProductInfoDTO> actual = dto.getCurrentProductInfoPage();
		assertEquals(expected, actual.get(0).getId());
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	
	
	@Test
	public void testGetCurrentProductInfoPage5() {
		PaginationDTO dto = new PaginationDTO();
		ProductInfoDTO product = new ProductInfoDTO();
		try{
		int expected = Integer.parseInt("-2147483649");
		product.setId(expected);
		List<ProductInfoDTO> list = Arrays.asList(product);
		dto.setCurrentProductInfoPage(list);

		List<ProductInfoDTO> actual = dto.getCurrentProductInfoPage();
		assertEquals(expected, actual.get(0).getId());
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}
	
	@Test
	public void testSetCurrentProductInfoPage5() {
		PaginationDTO dto = new PaginationDTO();
		ProductInfoDTO product = new ProductInfoDTO();
		try{
		int expected = Integer.parseInt("-2147483649");
		product.setId(expected);
		List<ProductInfoDTO> list = Arrays.asList(product);
		dto.setCurrentProductInfoPage(list);

		List<ProductInfoDTO> actual = dto.getCurrentProductInfoPage();
		assertEquals(expected, actual.get(0).getId());
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}
	
	
	@Test
	public void testHasNextPage1() {
		PaginationDTO dto = new PaginationDTO();
		Boolean expected = true;
		dto.setHasNextPage(expected);

		Boolean actual = dto.getHasNextPage();
		assertEquals(expected,actual);
	}


	@Test
	public void testSetNextPage1() {
		PaginationDTO dto = new PaginationDTO();
		Boolean expected = true;
		dto.setHasNextPage(expected);

		Boolean actual = dto.getHasNextPage();
		assertEquals(expected,actual);
	}

	@Test
	public void testHasNextPage2() {
		PaginationDTO dto = new PaginationDTO();
		Boolean expected = false;
		dto.setHasNextPage(expected);

		Boolean actual = dto.getHasNextPage();
		assertEquals(expected,actual);
	}


	@Test
	public void testSetNextPage2() {
		PaginationDTO dto = new PaginationDTO();
		Boolean expected = false;
		dto.setHasNextPage(expected);

		Boolean actual = dto.getHasNextPage();
		assertEquals(expected,actual);
	}


	@Test
	public void testHasPreviousPage1() {
		PaginationDTO dto = new PaginationDTO();
		Boolean expected = true;
		dto.setHasPreviousPage(expected);

		Boolean actual = dto.getHasPreviousPage();
		assertEquals(expected, actual);
	}



	@Test
	public void testSetPreviousPage1() {
		PaginationDTO dto = new PaginationDTO();
		Boolean expected = true;
		dto.setHasPreviousPage(expected);

		Boolean actual = dto.getHasPreviousPage();
		assertEquals(expected,actual);
	}


	@Test
	public void testHasPreviousPage2() {
		PaginationDTO dto = new PaginationDTO();
		Boolean expected = false;
		dto.setHasPreviousPage(expected);

		Boolean actual = dto.getHasPreviousPage();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPreviousPage2() {
		PaginationDTO dto = new PaginationDTO();
		Boolean expected = false;
		dto.setHasPreviousPage(expected);

		Boolean actual = dto.getHasPreviousPage();
		assertEquals(expected,actual);
	}


	@Test
	public void testGetNextPageNo1() {
		PaginationDTO dto = new PaginationDTO();
		int expected = 0;
		dto.setNextPageNo(expected);

		int actual = dto.getNextPageNo();
		assertEquals(expected, actual);

	}



	@Test
	public void testSetNextPageNo1() {
		PaginationDTO dto = new PaginationDTO();
		int expected = 0;
		dto.setNextPageNo(expected);

		int actual = dto.getNextPageNo();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetNextPageNo2() {
		PaginationDTO dto = new PaginationDTO();
		int expected = 2147483647;
		dto.setNextPageNo(expected);

		int actual = dto.getNextPageNo();
		assertEquals(expected, actual);

	}

	@Test
	public void testSetNextPageNo2() {
		PaginationDTO dto = new PaginationDTO();
		int expected = 2147483647;
		dto.setNextPageNo(expected);

		int actual = dto.getNextPageNo();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetNextPageNo3() {
		PaginationDTO dto = new PaginationDTO();
		int expected = -2147483648;
		dto.setNextPageNo(expected);

		int actual = dto.getNextPageNo();
		assertEquals(expected, actual);

	}

	@Test
	public void testSetNextPageNo3() {
		PaginationDTO dto = new PaginationDTO();
		int expected = -2147483648;
		dto.setNextPageNo(expected);

		int actual = dto.getNextPageNo();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetNextPageNo4(){
		PaginationDTO dto = new PaginationDTO();
		try{
		int expected = Integer.parseInt("2147483648");
		dto.setNextPageNo(expected);

		int actual = dto.getNextPageNo();
		assertEquals(expected , actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),  "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetNextPageNo4(){
		PaginationDTO dto = new PaginationDTO();
		try{
		int expected = Integer.parseInt("2147483648");
		dto.setNextPageNo(expected);

		int actual = dto.getNextPageNo();
		assertEquals(expected , actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),  "For input string: \"2147483648\"");
		}
	}


	@Test
	public void testGetNextPageNo5(){
		PaginationDTO dto = new PaginationDTO();
		try{
		int expected = Integer.parseInt("-2147483649");
		dto.setNextPageNo(expected);

		int actual = dto.getNextPageNo();
		assertEquals(expected , actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),  "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetNextPageNo5(){
		PaginationDTO dto = new PaginationDTO();
		try{
		int expected = Integer.parseInt("-2147483649");
		dto.setNextPageNo(expected);

		int actual = dto.getNextPageNo();
		assertEquals(expected , actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),  "For input string: \"-2147483649\"");
		}
	}


	@Test
	public void testGetPreviousPageNo1() {
		PaginationDTO dto = new PaginationDTO();
		int expected = 0;
	    dto.setPreviousPageNo(expected);

	    int actual = dto.getPreviousPageNo();
	    assertEquals(expected, actual);
		}



	@Test
	public void testSetPreviousPageNo1() {
		PaginationDTO dto = new PaginationDTO();
		int expected = 0;
		dto.setPreviousPageNo(expected);

		int actual = dto.getPreviousPageNo();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetPreviousPageNo2() {
		PaginationDTO dto = new PaginationDTO();
		int expected = 2147483647;
	    dto.setPreviousPageNo(expected);

	    int actual = dto.getPreviousPageNo();
	    assertEquals(expected, actual);
		}

	@Test
	public void testSetPreviousPageNo2() {
		PaginationDTO dto = new PaginationDTO();
		int expected = 2147483647;
		dto.setPreviousPageNo(expected);

		int actual = dto.getPreviousPageNo();
		assertEquals(expected , actual);
	}


	@Test
	public void testGetPreviousPageNo3() {
		PaginationDTO dto = new PaginationDTO();
		int expected = -2147483648;
	    dto.setPreviousPageNo(expected);

	    int actual = dto.getPreviousPageNo();
	    assertEquals(expected, actual);
		}

	@Test
	public void testSetPreviousPageNo3() {
		PaginationDTO dto = new PaginationDTO();
		int expected = -2147483648;
		dto.setPreviousPageNo(expected);

		int actual = dto.getPreviousPageNo();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetPreviousPageNo4(){
		PaginationDTO dto = new PaginationDTO();
		try{
			int expected = Integer.parseInt("2147483648");
			dto.setPreviousPageNo(expected);

			int actual = dto.getPreviousPageNo();
			assertEquals(expected, actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetPreviousPageNo4(){
		PaginationDTO dto = new PaginationDTO();
		try{
			int expected = Integer.parseInt("2147483648");
			dto.setPreviousPageNo(expected);

			int actual = dto.getPreviousPageNo();
			assertEquals(expected, actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetPreviousPageNo5(){
		PaginationDTO dto = new PaginationDTO();
		try{
			int expected = Integer.parseInt("-2147483649");
			dto.setPreviousPageNo(expected);

			int actual = dto.getPreviousPageNo();
			assertEquals(expected, actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetPreviousPageNo5(){
		PaginationDTO dto = new PaginationDTO();
		try{
			int expected = Integer.parseInt("-2147483649");
			dto.setPreviousPageNo(expected);

			int actual = dto.getPreviousPageNo();
			assertEquals(expected, actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}
}
