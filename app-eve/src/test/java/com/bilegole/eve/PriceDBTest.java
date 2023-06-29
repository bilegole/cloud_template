package com.bilegole.eve;

import com.bilegole.eve.dao.repository.ObjectPriceRepository;
import com.bilegole.eve.model.Enum.PriceType;
import com.bilegole.eve.model.entity.ObjectPrice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class PriceDBTest {
	@Autowired
	ObjectPriceRepository objectPriceRepository;

	@Test
	public void loadContext(){
		ObjectPrice objectPrice = new ObjectPrice();
		objectPrice.setId(1L);
		objectPrice.setObjectId("1");
		objectPrice.setPrice(100000000.12);
		objectPrice.setPriceType(PriceType.System);
		objectPrice.setRecordTime(new Date());
		objectPriceRepository.save(objectPrice);
	}
}
