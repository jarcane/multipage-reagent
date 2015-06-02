multipage
=========

Because I couldn't find one, a trivial example of a reagent app factored across multiple pages and namespaces.

By keeping the core r/atom in its own namespace, we can refer to it from any other namespace, though probably there's some more brilliant way to do this, probably using re-frame.

I put this here because I spent all day trying to find an example of this, and didn't.

To test it, run `lein figwheel`.

built with [reagent-template](https://github.com/reagent-project/reagent-template)

Do whatever you like with it. MIT License I guess, but they did most of the work.