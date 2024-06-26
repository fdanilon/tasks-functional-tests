package br.sp.fdanilo.tasks.functional;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TasksTest {
	
	public WebDriver acessarApp() {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://localhost:8001/tasks");
		
		return driver;
	}
	
	@Test
	public void deveSalvarTarefaComSucesso() {
		WebDriver driver = acessarApp();
		driver.findElement(By.id("addTodo")).click();
		driver.findElement(By.id("task")).sendKeys("Teste Via Selenium");
		driver.findElement(By.id("dueDate")).sendKeys("10/10/2030");
		driver.findElement(By.id("saveButton")).click();
		String mensagem = driver.findElement(By.id("message")).getText();
		
		Assert.assertEquals("Sucess!", mensagem);
		
		driver.quit();
		
	}
	
}
