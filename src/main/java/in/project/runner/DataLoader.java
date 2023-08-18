package in.project.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import in.project.entity.CitizenPlan;
import in.project.repo.CitizenPlanRepository;

@Component
public class DataLoader implements ApplicationRunner {
	@Autowired
	private CitizenPlanRepository repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		repo.deleteAll();
		CitizenPlan c1=new CitizenPlan();
		c1.setCitizenName("Sai");
		c1.setGender("Male");
		c1.setPlanStatus("Approved");
		c1.setPlanStartDate(LocalDate.now());
		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
		c1.setBenefitAmt(5000.00);

		CitizenPlan c2=new CitizenPlan();
		c2.setCitizenName("Roshini");
		c2.setGender("Female");
		c2.setPlanName("Cash");
		c2.setBenefitAmt(8500.00);
		c2.setPlanStatus("Denied");
		c2.setPlanStartDate(LocalDate.now());
		c2.setPlanEndDate(LocalDate.now().plusMonths(6));
		c2.setDeniedReason("Rental Income");

		CitizenPlan c3=new CitizenPlan();
		c3.setCitizenName("Priyanka");
		c3.setGender("Female");
		c3.setPlanName("Cash");
		c3.setPlanStatus("Denied");
		c3.setPlanStartDate(LocalDate.now());
		c3.setBenefitAmt(1000.00);
		c3.setPlanEndDate(LocalDate.now().plusMonths(6));
		c3.setDeniedReason("Rental Income");

		CitizenPlan c4=new CitizenPlan();
		c4.setCitizenName("Nari");
		c4.setGender("Male");
		c4.setPlanName("Food");
		c4.setPlanStatus("Denied");
		c4.setPlanStartDate(LocalDate.now());
		c4.setBenefitAmt(3000.00);
		c4.setPlanEndDate(LocalDate.now().plusMonths(6));
		c4.setDeniedReason("Employe");

		CitizenPlan c5=new CitizenPlan();
		c5.setCitizenName("Kajal");
		c5.setGender("Female");
		c5.setPlanName("Food");
		c5.setPlanStatus("Denied");
		c5.setPlanStartDate(LocalDate.now());
		c5.setPlanEndDate(LocalDate.now().plusMonths(6));
		c5.setDeniedReason("Govt Employee");
		c5.setBenefitAmt(4500.00);

		CitizenPlan c6=new CitizenPlan();
		c6.setCitizenName("Nidhi");
		c6.setGender("Female");
		c6.setPlanName("Cash");
		c6.setPlanStatus("Denied");
		c6.setPlanStartDate(LocalDate.now());
		c6.setPlanEndDate(LocalDate.now().plusMonths(6));
		c6.setDeniedReason("Rental Income");
		c6.setBenefitAmt(2000.00);

		CitizenPlan c7=new CitizenPlan();
		c7.setCitizenName("Gannu");
		c7.setGender("Male");
		c7.setPlanName("Medical");
		c7.setPlanStatus("Denied");
		c7.setDeniedReason("Property Come");
		c7.setBenefitAmt(8700.00);

		CitizenPlan c8=new CitizenPlan();
		c8.setCitizenName("Srilaxmi");
		c8.setGender("Female");
		c8.setPlanName("Medical");
		c8.setPlanStatus("Terminated");
		c8.setPlanStartDate(LocalDate.now());
		c8.setBenefitAmt(4700.00);
		c8.setPlanEndDate(LocalDate.now().plusMonths(6));
		c8.setDeniedReason("Govt Job");

		CitizenPlan c9=new CitizenPlan();
		c9.setCitizenName("Swetha");
		c9.setGender("Female");
		c9.setPlanName("Cash");
		c9.setPlanStatus("Denied");
		c9.setPlanStartDate(LocalDate.now());
		c9.setBenefitAmt(7000.00);
		c9.setPlanEndDate(LocalDate.now().plusMonths(6));
		c9.setDeniedReason("Govt Job");

		List<CitizenPlan> list =Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9);
		repo.saveAll(list);
	}
}
