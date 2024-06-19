package main.controllers;

import main.modules.ApplicationEntity;
import main.modules.Attribute;
import main.modules.TextAttribute;
import main.modules.dtos.AttributeDTO;
import main.modules.dtos.TextAttributeDTO;
import main.services.ResponseService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ResponseControllerTests {

    @Mock
    private ResponseService responseService;

    @InjectMocks
    private ResponseController responseController;

    private TextAttribute textAttribute;

    @BeforeEach
    void setUp() {
        textAttribute = new TextAttribute(new TextAttributeDTO("New Attribute",  false,"Test Placeholder"));
    }

    @Test
    void testResponses() {
        when(responseService.getAllResponses()).thenReturn(Collections.singletonList(textAttribute));

        List<Attribute> responses = responseController.getAllResponses();
        assertEquals(1, responses.size());
        assertEquals("New Attribute", responses.getFirst().getName());
        verify(responseService, times(1)).getAllResponses();
    }

    @Test
    void testCreateEntity() {
        when(responseService.createTextResponses(ArgumentMatchers.any(TextAttribute.class))).thenReturn(textAttribute);

        Attribute createdResponse = responseController.addTextResponse(new TextAttributeDTO("Test Name", false,"Test Placeholder"));

        assertEquals("New Attribute", createdResponse.getName());
        verify(responseService, times(1)).createTextResponses(ArgumentMatchers.any(TextAttribute.class));
    }
}
