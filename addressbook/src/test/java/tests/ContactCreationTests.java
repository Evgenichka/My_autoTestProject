package addressbook.src.test.java.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Groups;

import java.io.File;

public class ContactCreationTests extends TestBase {

  @BeforeMethod(alwaysRun = true)
  public void ensurePreconditions() {
    // Предварительная подготовка перед запуском теста
    // Например, очистка базы данных или проверка наличия определенных условий
  }
  @Test
   public void testContactCreation() {
     Groups groups = app.db().groups();
     File photo = new File("src/test/resources/stru.png");
     ContactData newContact = new ContactData()
            .withFirstname("test_name")
            .withLastname("test_surname")
            .withPhoto(photo)
            .inGroup(groups.iterator().next()); // присваиваем контакт первой группе из БД

    app.goTo().gotoHomePage();
    app.contact().initContactCreation();
    app.contact().fillContactForm(newContact, true);
    app.contact().submitContactCreation();
    app.contact().returnToHomePage();
  }

}
