//Генерация сущностей JOOQ в Java-коде
@Component //для непосредственного создания бина
public class AfterStartupApplicationListener implements ApplicationListener<ContexRefreshedEvent> {
  
  @Value("${spring.datasource.driver-class-name}") //указывает значение по умолчанию
  private String drier;
  
  @Value("${spring.datasourse.url}")
  private String url;
  
  @Value("${spring.datasourse.username}")
  private String username;
  
  @Value("${spring.datasourse.password}")
  private String password;
  
  @Value("${jooq.generator.database.name}")
  private String databaseName;
  
  @Value("${jooq.generator.database.with-includes}")
  private String databaseWithIncludes;
  
  @Value("${jooq.generator.database.with-input-schema}")
  private String databaseWithInputSchema;

   @Value("${jooq.generator.target.package-name}")
   private String targetPackageName;

   @Value("${jooq.generator.target.directory}")
   private String targetDirectory;
  
  @SneakyTrows //для скрытого генерирования проверенных исключений без фактического объявления этого 
               //в предложении throws вашего метода.
  @Override
  public void onApplicationEven(ContexRefreshedEvent contextRefreshedEvent) {
    new GenerationTool().run(configureGenerator());
  }
  
  private Configuration configureGenerator() {
    return new Configuration()
      .withJdbc(new Jdbc())
              .withDriver(driver)
              .withUrl(url)
              .withUser(username)
              .withPassword(password))
      .withGenerator(new Generator)
          .withDatabase(new Generator)
                     .withName(databaseName)
                     .withIncludes(databaseWithIncludes)
                     .withExcludes("")
                     .withInputShema(databaseWithInputSchema))
          .withTarget(new Target()
                     .withPackageName(targetPackageName)
                     .withDirectory(targetDirectory)));
  }
}

         
