#!/bin/sh

source $(dirname "$0")/main.sh

run_cart_test() {
    eval "runTest com.wsgc.cart.${className} ${className}_${ratePerSecond}_${durationInSeconds}_${a} -Dcart.${propertyPath}.ratePerSecond=${ratePerSecond} -Dcart.${propertyPath}.durationInSeconds=${durationInSeconds} -Dcart.${propertyPath}.rampUpTimeInSeconds=${rampUpTimeInSeconds}"
}

run_cart_tests() {
    className="CreateCart"
    propertyPath="create"
    run_cart_test

    className="ProcessCartWithBillingAndShippingAddressWithOrderNumber"
    propertyPath="process.withBillingShippingWithOrder"
    run_cart_test

    className="ProcessCartWithBillingAndShippingAddressWithoutOrderNumber"
    propertyPath="process.withBillingShippingWithoutOrder"
    run_cart_test

    className="ProcessCartWithoutBillingAndShippingAddressWithoutOrderNumber"
    propertyPath="process.withoutBillingShippingWithoutOrder"
    run_cart_test

    className="ProcessCartSendAffirmLoanApplication"
    propertyPath="process.sendAffirmLoanApplication"
    run_cart_test

    className="ProcessCartRetrieveTenderToken"
    propertyPath="process.retrieveTenderToken"
    run_cart_test

    className="UpdateTenderToken"
    propertyPath="updateTenderToken"
    run_cart_test

    className="PlaceOrder"
    propertyPath="placeOrder"
    run_cart_test

    className="CheckoutFlow"
    propertyPath="checkoutFlow"
    run_cart_test

    className="AffirmStoreCheckoutFlow"
    propertyPath="affirmStoreCheckoutFlow"
    run_cart_test

    className="CheckoutAlternateChargesFlow"
    propertyPath="checkoutAlternateChargesFlow"
    run_cart_test
    
    className="CheckoutOrderFreeSwatchesFlow"
    propertyPath="checkoutOrderFreeSwatchesFlow"
    run_cart_test
}

for a in `seq 1 ${RUN_COUNT}`; do
    echo "sleeping ${SLEEP_SECONDS}..."
    sleep ${SLEEP_SECONDS}

    ratePerSecond=5
    durationInSeconds=20
    rampUpTimeInSeconds=5

    run_cart_tests

    ratePerSecond=10
    durationInSeconds=10
    rampUpTimeInSeconds=10

    run_cart_tests

    ratePerSecond=20
    durationInSeconds=5
    rampUpTimeInSeconds=20

    run_cart_tests

done



exit 0
