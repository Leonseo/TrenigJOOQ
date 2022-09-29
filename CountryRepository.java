@Repository //место, где хранятся и поддерживаются данные
@RequiredArgsConstructor //создает конструктор со всеми атрибутами конце класса. 
                         //Так, Spring впрыскивает для нас все обязательные зависимости.
public class CountryRepository implements CrudRepository<Country> {

    private final DSLContext dsl;

} 
