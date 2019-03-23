package ro.utcn.sd.vasi.SnackOverflow.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;
import ro.utcn.sd.vasi.SnackOverflow.repository.api.RepositoryFactory;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
//@Transactional
public class AnswerManagementServiceTest {

    @Autowired
    private RepositoryFactory repositoryFactory;

    @Test
    public void addAnswer() {
       System.out.println("ASDF");
    }
}