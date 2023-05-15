
    package ru.netology.service;

    import org.junit.Test;

    import static org.junit.Assert.assertEquals;

    public class CashbackHackServiceTest {

        @Test
        public void shouldCalculateRemainPurchaseIfAmountFiveHundred() {

            CashbackHackService service = new CashbackHackService();

            assertEquals(500, service.remain(500));
        }

        @Test
        public void shouldCalculateRemainPurchaseIfAmountEqualsThousand() {

            CashbackHackService service = new CashbackHackService();

            assertEquals(0, service.remain(1_000));
        }

        @Test
        public void shouldCalculateRemainPurchaseIfAmountOneLessThousand() {

            CashbackHackService service = new CashbackHackService();

            assertEquals(1, service.remain(999));
        }

        @Test
        public void shouldCalculateRemainPurchaseIfAmountMoreThousandByOne() {

            CashbackHackService service = new CashbackHackService();

            assertEquals(999, service.remain(1_001));
        }

        @Test
        public void shouldCalculateRemainPurchaseIfAmountZero() {

            CashbackHackService service = new CashbackHackService();

            assertEquals(1_000, service.remain(0));
        }

        @Test
        public void shouldCalculateRemainPurchaseIfAmountOneThousandFiveHundred() {

            CashbackHackService service = new CashbackHackService();

            assertEquals(500, service.remain(1_500));
        }

        @Test
        public void shouldCalculateRemainPurchaseIfAmountEqualsTwoThousand() {

            CashbackHackService service = new CashbackHackService();

            assertEquals(0, service.remain(2_000));
        }

        @Test
        public void shouldCalculateRemainPurchaseIfAmountTwoThousandFiveHundred() {

            CashbackHackService service = new CashbackHackService();

            assertEquals(500, service.remain(2_500));
        }

    }

