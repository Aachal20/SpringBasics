package it.nt.comp1;

import org.springframework.beans.factory.annotation.Value;

public class TestBean {
	@Value("{per.name}")
 private String name;
}
