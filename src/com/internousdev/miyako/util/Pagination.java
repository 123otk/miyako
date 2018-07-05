package com.internousdev.miyako.util;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.miyako.dto.PaginationDTO;
import com.internousdev.miyako.dto.ProductInfoDTO;

public class Pagination {


	public PaginationDTO initialize(List<ProductInfoDTO> list, int pageSize) {  // pageSize=1ページあたりの表示個数

		PaginationDTO paginationDTO = new PaginationDTO();
		// 全ページ数
		paginationDTO.setTotalPageSize((int)(Math.ceil((double)list.size() / pageSize)));

		// 現在のページ番号
		paginationDTO.setCurrentPageNo(1);
		// 全レコード数
		paginationDTO.setTotalRecordSize(list.size() - 1);
		// 現在のページ番号に対する開始レコード番号（オフセット）
		paginationDTO.setStartRecordNo(pageSize * (paginationDTO.getCurrentPageNo() -1));
		// 現在のページ番号に対する終了レコード番号
		paginationDTO.setEndRecordNo(paginationDTO.getStartRecordNo() + (pageSize - 1));

		List<Integer> pageNumberList = new ArrayList<Integer>();
		for(int pageNumber = 1;pageNumber <= paginationDTO.getTotalPageSize(); pageNumber++) {
			pageNumberList.add(pageNumber);
		}

		List<ProductInfoDTO> productInfoPages = new ArrayList<ProductInfoDTO>();
		for(int pageNumberOffset=paginationDTO.getStartRecordNo(); pageNumberOffset <= paginationDTO.getEndRecordNo(); pageNumberOffset++) {
			productInfoPages.add(list.get(pageNumberOffset));
		}
		paginationDTO.setCurrentProductInfoPage(productInfoPages);

		if((paginationDTO.getStartRecordNo() - 1) <= 0) {
			paginationDTO.setHasNextPage(false);;
		}else {
			paginationDTO.setHasPreviousPage(true);;
			paginationDTO.setPreviousPageNo(paginationDTO.getCurrentPageNo() - 1);
		}

		if(paginationDTO.getEndRecordNo() + pageSize > paginationDTO.getTotalRecordSize()) {
			paginationDTO.setHasNextPage(false);
		}else {
			paginationDTO.setHasPreviousPage(true);
			paginationDTO.setNextPageNo(paginationDTO.getCurrentPageNo() + 1);
		}
		return paginationDTO;
	}


	public PaginationDTO getPage(List<ProductInfoDTO> list, int pageSize, String pageNo) {

		PaginationDTO paginationDTO = new PaginationDTO();
		// 全ページ数
		paginationDTO.setTotalPageSize((int)(Math.ceil((double)list.size() / pageSize)));
		// 現在のページ番号
		paginationDTO.setCurrentPageNo(Integer.parseInt(pageNo));
		// 全レコード数
		paginationDTO.setTotalRecordSize(list.size() - 1);
		// 現在のページ番号に対する開始レコード番号（オフセット）
		paginationDTO.setStartRecordNo(pageSize * (paginationDTO.getCurrentPageNo() -1));
		// 現在のページ番号に対する開始レコード番号
//		paginationDTO.setStartRecordNo((pageSize * paginationDTO.getCurrentPageNo()) + 1);
		// 現在のページ番号に対する終了レコード番号
		paginationDTO.setEndRecordNo(paginationDTO.getStartRecordNo() + (pageSize - 1));

		if(Integer.parseInt(pageNo) == paginationDTO.getTotalPageSize() && list.size() % pageSize != 0){

		  List<ProductInfoDTO> productInfoPages = new ArrayList<ProductInfoDTO>();
		      int i = list.size() % pageSize;

			for(int pageNumberOffset=paginationDTO.getStartRecordNo(); pageNumberOffset <= paginationDTO.getEndRecordNo()-pageSize+i; pageNumberOffset++) {


				productInfoPages.add(list.get(pageNumberOffset));
			}
			paginationDTO.setCurrentProductInfoPage(productInfoPages);

			return paginationDTO;
		}



		List<Integer> pageNumberList = new ArrayList<Integer>();
		for(int pageNumber = 1;pageNumber <= paginationDTO.getTotalPageSize(); pageNumber++) {
			pageNumberList.add(pageNumber);
		}

		List<ProductInfoDTO> productInfoPages = new ArrayList<ProductInfoDTO>();
		for(int pageNumberOffset=paginationDTO.getStartRecordNo(); pageNumberOffset <= paginationDTO.getEndRecordNo(); pageNumberOffset++) {

			productInfoPages.add(list.get(pageNumberOffset));
		}
		paginationDTO.setCurrentProductInfoPage(productInfoPages);



		if((paginationDTO.getStartRecordNo() - 1) <= 0) {
			paginationDTO.setHasPreviousPage(false);
		}else {
			paginationDTO.setHasPreviousPage(true);
			paginationDTO.setPreviousPageNo(paginationDTO.getCurrentPageNo() - 1);
		}

		if(paginationDTO.getEndRecordNo() + pageSize > paginationDTO.getTotalRecordSize()) {
			paginationDTO.setHasNextPage(false);
		}else {
			paginationDTO.setHasNextPage(true);
			paginationDTO.setNextPageNo(paginationDTO.getCurrentPageNo() + 1);
		}



		return paginationDTO;

	}

}