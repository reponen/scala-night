package examples

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/**
 * Testing (and using) Java code from Scala is easy...
 */
@RunWith(classOf[JUnitRunner])
class FamilyBankTest extends FunSuite {
	test("initial balance must not be negative") {
		intercept[AssertionError] {
			new FamilyBank(-10)
		}
		new FamilyBank(0)
	}
	
	test("cannot deposit negative money") {
		intercept[NegativeDeposit] {
			val bank = new FamilyBank(0)
			bank.deposit(-10)
		}
	}
	
	test("cannot save more than saving account has") {
		intercept[NotEnoughMoney] {
			val bank = new FamilyBank(10)
			bank.save(20)
		}
	}

	test("moving money from spending account to savings should not alter total amount of money") {
		val bank = new FamilyBank(0)
		assert( bank.money() === 0)
		bank.deposit(25)
		assert( bank.money() === 25)
		bank.save(10)
		assert( bank.money() === 25)
		
		bank.save(-10) 
		assert( bank.money() === 25)
	}
}