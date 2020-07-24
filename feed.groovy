from('telegram:bots?authorizationToken=1301724248:AAHIm9_-g_RGDGB6tMEpcIxAovnQaa9YQjc')
  .convertBodyTo(String.class)
  .to('log:info')
  .to('knative:channel/messages')