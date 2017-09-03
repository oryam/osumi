package com.oryam.service.osumi.domain.spi;

import com.oryam.service.osumi.domain.common.ItemDetail;
import com.oryam.service.osumi.domain.common.SearchResult;
import com.oryam.service.osumi.domain.criteria.ItemSearchCriteria;

public interface ItemProvider {

    ItemDetail getDetail(Long id);

    SearchResult<ItemDetail> findAll();

    SearchResult<ItemDetail> search(ItemSearchCriteria criteria);

}
