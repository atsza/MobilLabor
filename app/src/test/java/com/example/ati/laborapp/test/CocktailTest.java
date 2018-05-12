package com.example.ati.laborapp.test;

import com.example.ati.laborapp.BuildConfig;
import com.example.ati.laborapp.ui.main.MainPresenter;
import com.example.ati.laborapp.ui.main.MainScreen;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.robolectric.annotation.Config;
import org.robolectric.RobolectricTestRunner;

import java.util.List;


import static com.example.ati.laborapp.TestHelper.setTestInjector;
import static junit.framework.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class CocktailTest {

    private MainPresenter mainPresenter;
    private MainScreen mainScreen;
    private String query;

    @Before
    public void setup() throws Exception {
        setTestInjector();
        mainScreen = mock(MainScreen.class);
        mainPresenter = new MainPresenter();
        mainPresenter.attachScreen(mainScreen);
    }

    @Test
    public void testMainPresenter() {
        query = "a";
        mainPresenter.ShowCocktailsList(query);

        ArgumentCaptor<List> cocktailCaptor = ArgumentCaptor.forClass(List.class);
        verify(mainScreen).showCocktails(cocktailCaptor.capture().toString());
        assertTrue(cocktailCaptor.getValue().size() > 0);
    }


    @After
    public void tearDown() {
        mainPresenter.detachScreen();
    }
}