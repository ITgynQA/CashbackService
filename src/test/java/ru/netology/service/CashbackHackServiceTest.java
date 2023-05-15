
    package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

    public class CashbackHackServiceTest {

        @Test
        public void shouldCalculateRemainPurchaseIfAmountFiveHundred() {

            CashbackHackService service = new CashbackHackService();

            assertEquals(service.remain(500), 500);
        }

        @Test
        public void shouldCalculateRemainPurchaseIfAmountEqualsThousand() {

            CashbackHackService service = new CashbackHackService();

            assertEquals(service.remain(1_000), 0);
        }

        @Test
        public void shouldCalculateRemainPurchaseIfAmountOneLessThousand() {

            CashbackHackService service = new CashbackHackService();

            assertEquals(service.remain(999), 1);
        }

        @Test
        public void shouldCalculateRemainPurchaseIfAmountMoreThousandByOne() {

            CashbackHackService service = new CashbackHackService();

            assertEquals(service.remain(1_001), 999);
        }

        @Test
        public void shouldCalculateRemainPurchaseIfAmountZero() {

            CashbackHackService service = new CashbackHackService();

            assertEquals(service.remain(0), 1_000);
        }

        @Test
        public void shouldCalculateRemainPurchaseIfAmountOneThousandFiveHundred() {

            CashbackHackService service = new CashbackHackService();

            assertEquals(service.remain(1_500), 500);
        }

        @Test
        public void shouldCalculateRemainPurchaseIfAmountEqualsTwoThousand() {

            CashbackHackService service = new CashbackHackService();

            assertEquals(service.remain(2_000), 0);
        }

        @Test
        public void shouldCalculateRemainPurchaseIfAmountTwoThousandFiveHundred() {

            CashbackHackService service = new CashbackHackService();

            assertEquals(service.remain(2_500), 500);
        }

    }


