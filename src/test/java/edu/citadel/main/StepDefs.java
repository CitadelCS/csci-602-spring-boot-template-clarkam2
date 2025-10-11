package edu.citadel.main;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import static org.assertj.core.api.Assertions.assertThat;

public class StepDefs extends SpringIntegrationTest {

    private ResponseEntity<String> latestResponse;

    @When("^the client calls (.+)$")
    public void the_client_issues_GET(String endpoint) {
        latestResponse = restTemplate.getForEntity("http://localhost:8080" + endpoint, String.class);
    }

    @Then("^the client receives status code of (\\d+)$")
    public void the_client_receives_status_code_of(int expectedStatusCode) {
        assertThat(latestResponse.getStatusCode().value()).isEqualTo(expectedStatusCode);
    }

    @And("^the client receives server version (.+)$")
    public void the_client_receives_server_version(String expectedVersion) {
        assertThat(latestResponse.getBody()).isEqualTo(expectedVersion);
    }

    @And("^the client receives server response \"([^\"]*)\"$")
    public void the_client_receives_server_response(String expectedResponse) {
        assertThat(latestResponse.getBody()).isEqualTo(expectedResponse);
    }
}
