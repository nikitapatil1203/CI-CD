package com.abhishek;

import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class StartApplicationTest {

    @Test
    void testIndexMethod() {

        // Arrange
        StartApplication controller = new StartApplication();
        Model model = mock(Model.class);

        // Act
        String viewName = controller.index(model);

        // Assert
        assertEquals("index", viewName);

        verify(model).addAttribute(
                "title",
                "I have successfuly built a sprint boot application using Maven"
        );

        verify(model).addAttribute(
                "msg",
                "This application is deployed on to Kubernetes using Argo CD"
        );
    }
}
