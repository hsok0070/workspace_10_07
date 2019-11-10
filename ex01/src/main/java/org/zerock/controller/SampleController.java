package org.zerock.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.SampleDTO;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import lombok.EqualsAndHashCode;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {
	
	/*
	 * @RequestMapping(value= "/basic", method =
	 * {RequestMethod.GET,RequestMethod.POST}) public void basic() {
	 * log.info("basic get............."); }
	 * 
	 * @GetMapping("/basicOnlyGet") public void basicGet2(){
	 * log.info("basic get only get...................."); }
	 */
	
	
	
	/*
	 * @RequestMapping("/ex01") public String ex01(SampleDTO dto) { log.info("" +
	 * dto); return "ex01"; }
	 */
	 	 	
	/*
	 * @RequestMapping("/ex02") public String ex02(@RequestParam("name") String
	 * name,
	 * 
	 * @RequestParam("age") int age) {
	 * 
	 * log.info("name" + name); log.info("age" + age);
	 * 
	 * return "ex02"; }
	 */
	
	/*
	 * @GetMapping("/ex02") public String ex02(@RequestParam("name") String
	 * name, @RequestParam("age") int age) {
	 * 
	 * log.info("name" + name); log.info("age" + age); return "ex02";
	 * 
	 * }
	 * 
	 */
	
	/*
	 * @GetMapping("/ex02List") public String ex02List(@RequestParam("ids")
	 * ArrayList<String> ids) {
	 * 
	 * log.info("ids:"+ids); return "ex02List"; }
	 */
	
	/*
	 * @GetMapping("/ex02Array") public String
	 * ex02Array(@RequestParam("name")String[] name) {
	 * 
	 * log.info("array"+Arrays.toString(name));
	 * 
	 * return "ex02Array"; }
	 */
	
	@GetMapping("/ex02Bean")
	public String ex02Bean(SampleDTO list) {
		
		log.info("list dtos" + list);
		return "ex20Bean";
	}
	
	
}
