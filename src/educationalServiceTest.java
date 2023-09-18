import org.junit.Rule;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class educationalServiceTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();


    private StudentDataObject studentDataObject;

    @Mock
    private InstructorDataObject instructorDataObject;

    @Mock
    private ClassDataObject classDataObject;

    @InjectMocks
    private ClientBusinessObjectImpl clientBusinessObjectImpl;

    @Test
    public <Student> void testStudentsByClass() {
        Student studentJM = new Student("Joy Ma", "Spanish");
        Student studentJH = new Student("Julio Hernandez", "Algebra");
        Student studentJJ = new Student("Jenny Jones", "Calculus");
        List<Student> allStudents = Arrays.asList(studentJM, studentJH, studentJJ);

        given(studentDataObject.getAllStudents()).willReturn(allStudents);
        List<String> mathStudents = clientBusinessObjectImpl.getAllStudentsBySubject(“math”);

        assertThat(mathStudents.size(), is(2));
        assertThat(mathStudents, hasItems(studentJJ, student JH);
    }
}
