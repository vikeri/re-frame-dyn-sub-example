# re-frame-dynamic-subscription

Example repo to show how subscriptions are triggered twice if they have a dynamic subscription and a subscription to the actual value as well. First trigger the direct subscription is updated and on second trigger the dynamic subscription is updated. Unsure if this is the intended behaviour. See [src/cljs/re_frame_testing/subs.cljs](src/cljs/re_frame_testing/subs.cljs)

To test:

### Run application:

```
lein clean
lein figwheel dev
```

Figwheel will automatically push cljs changes to the browser.

Wait a bit, then browse to [http://localhost:3449](http://localhost:3449).

Then 

Click the "Count 1" div and look in the console.