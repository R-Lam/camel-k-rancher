from('knative:channel/words')
  .log('Received: ${body}')
  .to('slack:#knative')


camel {
  components {
    slack {
      webhookUrl 'https://hooks.slack.com/services/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'
    }
  }
}