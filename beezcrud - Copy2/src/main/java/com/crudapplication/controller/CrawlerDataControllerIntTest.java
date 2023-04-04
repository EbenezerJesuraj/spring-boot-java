package com.crudapplication.controller;

/* 
public class CrawlerDataControllerIntTest {
    
    @Autowired
    private CrawlerDataPagingRepository crawlerDataPagingRepository;
    @Autowired
    private QuerydslPredicateArgumentResolver querydslPredicateArgumentResolver;
    private Object restNameMockMvc;

    @PostConstruct
    public void setup() {
        //Object MockitoAnnotations;
        MockitoAnnotations.initMocks(this);
        CrawlerDataController crawlerDataController = new CrawlerDataController(crawlerDataPagingRepository);
        Object jacksonMessageConverter;
        Object pageableArgumentResolver;
        Object MockMvcBuilders;
        this.restNameMockMvc = MockMvcBuilders.standaloneSetup(crawlerDataController)
            .setCustomArgumentResolvers(pageableArgumentResolver, querydslPredicateArgumentResolver)
            .setMessageConverters(jacksonMessageConverter).build();
    }
}
*/