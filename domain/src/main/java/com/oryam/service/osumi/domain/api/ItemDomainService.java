package com.oryam.service.osumi.domain.api;

import com.oryam.service.osumi.domain.common.ItemDetail;
import com.oryam.service.osumi.domain.common.SearchResult;
import com.oryam.service.osumi.domain.criteria.ItemSearchCriteria;

public interface ItemDomainService {

    ItemDetail getDetail(Long id);

    SearchResult<ItemDetail> findAll();

    SearchResult<ItemDetail> search(ItemSearchCriteria criteria);

}
