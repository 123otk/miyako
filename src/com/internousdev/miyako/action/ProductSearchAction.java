package com.internousdev.miyako.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miyako.dao.CategoryDAO;
import com.internousdev.miyako.dao.ProductInfoDAO;
import com.internousdev.miyako.dto.CategoryDTO;
import com.internousdev.miyako.dto.PaginationDTO;
import com.internousdev.miyako.dto.ProductInfoDTO;
import com.internousdev.miyako.util.InputChecker;
import com.internousdev.miyako.util.Pagination;
import com.opensymphony.xwork2.ActionSupport;

public class ProductSearchAction extends ActionSupport implements SessionAware{
	private String categoryId;
	private String keywords;
	private String pageNo;
	private List<CategoryDTO> categoryDtoList = new ArrayList<CategoryDTO>();
	private List<String> keywordsErrorMessageList = new ArrayList<String>();
	private List<ProductInfoDTO> productInfoDtoList = new ArrayList<ProductInfoDTO>();
	private Map<String, Object> session;

	public String execute() {

		String result = ERROR;

		InputChecker inputChecker = new InputChecker();
		if(keywords==null) {
			keywords="";
		}

		if(categoryId==null){
			categoryId= "1";
		}

//		int kuuhakunobasho = keywords.indexOf(" ");
//		normalizedText = Normalizer.normalize(kuuhakunobasho, Normalizer.Form.NFKC);
//		System.out.println(kuuhakunobasho);

		keywordsErrorMessageList = inputChecker.doCheck("検索ワード", keywords, 0, 16, true, true, true, true, false,true,true, false);

		ProductInfoDAO productInfoDAO = new ProductInfoDAO();

		switch (categoryId) {
			case "1":
				productInfoDtoList = productInfoDAO.getProductInfoListAll(keywords.replaceAll("　", " ").split(" "));
				session.put("keywords", keywords);

				result = SUCCESS;

				break;

			default:
				productInfoDtoList = productInfoDAO.getProductInfoListByKeywords(keywords.replaceAll("　", " ").split(" "), categoryId);
				result = SUCCESS;
				break;
		}
		Iterator<ProductInfoDTO> iterator = productInfoDtoList.iterator();
		if(!(iterator.hasNext())) {
			productInfoDtoList = null;
		}
		session.put("keywordsErrorMessageList", keywordsErrorMessageList);



	if(!session.containsKey("CategoryList")) {
		CategoryDAO CategoryDao = new CategoryDAO();
		categoryDtoList = CategoryDao.getCategoryList();
		session.put("CategoryDtoList", categoryDtoList);
	}






	if(!(productInfoDtoList==null)) {


		if(productInfoDtoList.size()<6){
			Pagination pagination = new Pagination();
			PaginationDTO paginationDTO = new PaginationDTO();

			paginationDTO = pagination.initialize(productInfoDtoList, productInfoDtoList.size());

			session.put("productInfoDtoList", paginationDTO.getCurrentProductInfoPage());
			session.put("totalPageSize", paginationDTO.getTotalPageSize());
			session.put("currentPageNo", paginationDTO.getCurrentPageNo());
			session.put("totalRecordSize", paginationDTO.getTotalRecordSize());
			session.put("startRecordNo", paginationDTO.getStartRecordNo());
			session.put("endRecordNo", paginationDTO.getEndRecordNo());
			session.put("previousPage", paginationDTO.getHasPreviousPage());
			session.put("previousPageNo", paginationDTO.getPreviousPageNo());
			session.put("nextPage", paginationDTO.getHasNextPage());
			session.put("nextPageNo", paginationDTO.getNextPageNo());


			return result;
		}


		Pagination pagination = new Pagination();
		PaginationDTO paginationDTO = new PaginationDTO();
			if(pageNo==null) {
				paginationDTO = pagination.initialize(productInfoDtoList, 6);

				}else {

					paginationDTO = pagination.getPage(productInfoDtoList, 6, pageNo);

				}

		session.put("productInfoDtoList", paginationDTO.getCurrentProductInfoPage());
		session.put("totalPageSize", paginationDTO.getTotalPageSize());
		session.put("currentPageNo", paginationDTO.getCurrentPageNo());
		session.put("totalRecordSize", paginationDTO.getTotalRecordSize());
		session.put("startRecordNo", paginationDTO.getStartRecordNo());
		session.put("endRecordNo", paginationDTO.getEndRecordNo());
		session.put("previousPage", paginationDTO.getHasPreviousPage());
		session.put("previousPageNo", paginationDTO.getPreviousPageNo());
		session.put("nextPage", paginationDTO.getHasNextPage());
		session.put("nextPageNo", paginationDTO.getNextPageNo());
		}else {
			session.put("productInfoDtoList", null);
		}
		return result;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getPageNo() {
		return pageNo;
	}

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public List<CategoryDTO> getCategoryDtoList() {
		return categoryDtoList;
	}

	public void setCategoryDtoList(List<CategoryDTO> categoryDtoList) {
		this.categoryDtoList = categoryDtoList;
	}

	public List<String> getKeywordsErrorMessageList() {
		return keywordsErrorMessageList;
	}

	public void setKeywordsErrorMessageList(List<String> keywordsErrorMessageList) {
		this.keywordsErrorMessageList = keywordsErrorMessageList;
	}

	public List<ProductInfoDTO> getProductInfoDtoList() {
		return productInfoDtoList;
	}

	public void setProductInfoDtoList(List<ProductInfoDTO> productInfoDtoList) {
		this.productInfoDtoList = productInfoDtoList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	}